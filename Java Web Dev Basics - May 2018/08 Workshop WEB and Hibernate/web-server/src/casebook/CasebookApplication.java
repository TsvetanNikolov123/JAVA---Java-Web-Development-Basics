package casebook;

import javache.WebConstants;
import javache.api.RequestHandler;
import javache.http.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CasebookApplication implements RequestHandler {
    private static final String HTML_EXTENSION_AND_SEPARATOR = ".html";

    private boolean intercepted = false;
    private HttpRequest httpRequest;
    private HttpResponse httpResponse;
    private HttpSessionStorage sessionStorage;

    public CasebookApplication(HttpSessionStorage sessionStorage) {
        this.intercepted = false;
        this.sessionStorage = sessionStorage;
    }

    @Override
    public byte[] handleRequest(String requestContent) {
        this.httpRequest = new HttpRequestImpl(requestContent);
        this.httpResponse = new HttpResponseImpl();

        byte[] result = null;

        if (this.httpRequest.getMethod().equals("GET")) {
            result = this.processGetRequest();
        }

        this.sessionStorage.refreshSessions();
        this.intercepted = true;
        return result;
    }

    @Override
    public boolean hasIntercepted() {
        return this.intercepted;
    }

    private byte[] ok(byte[] content) {
        this.httpResponse.setStatusCode(HttpStatus.Ok);
        this.httpResponse.setContent(content);
        return this.httpResponse.getBytes();
    }

    private byte[] badRequest(byte[] content) {
        this.httpResponse.setStatusCode(HttpStatus.BadRequest);
        this.httpResponse.setContent(content);
        return this.httpResponse.getBytes();
    }

    private byte[] notFound(byte[] content) {
        this.httpResponse.setStatusCode(HttpStatus.NotFound);
        this.httpResponse.setContent(content);
        return this.httpResponse.getBytes();
    }

    private byte[] redirect(byte[] content, String location) {
        this.httpResponse.setStatusCode(HttpStatus.SeeOther);
        this.httpResponse.addHeader("Location", location);
        this.httpResponse.setContent(content);
        return this.httpResponse.getBytes();
    }

    private byte[] internalServerError(byte[] content) {
        this.httpResponse.setStatusCode(HttpStatus.InternalServerError);
        this.httpResponse.setContent(content);
        return this.httpResponse.getBytes();
    }

    private String getMimeType(File file) {
        String fileName = file.getName();

        if (fileName.endsWith("css")) {
            return "text/css";
        } else if (fileName.endsWith("html")) {
            return "text/html";
        } else if (fileName.endsWith("jpg") || fileName.endsWith("jpeg")) {
            return "image/jpeg";
        } else if (fileName.endsWith("png")) {
            return "image/png";
        }

        return "text/plain";
    }

    private byte[] processResourceRequest() {
        String assetPath = WebConstants.ASSETS_FOLDER_PATH +
                this.httpRequest.getRequestUrl();

        File file = new File(assetPath);

        if (!file.exists() || file.isDirectory()) {
            return this.notFound(("Asset not found!").getBytes());
        }

        byte[] result = null;

        try {
            result = Files.readAllBytes(Paths.get(assetPath));
        } catch (IOException e) {
            return this.internalServerError(("Something went wrong!").getBytes());
        }

        this.httpResponse.addHeader("Content-Type", this.getMimeType(file));
        this.httpResponse.addHeader("Content-Length", result.length + "");
        this.httpResponse.addHeader("Content-Disposition", "inline");

        return this.ok(result);
    }

    private byte[] processPageRequest(String page) {
        String pagePath = WebConstants.PAGES_FOLDER_PATH +
                page
                + HTML_EXTENSION_AND_SEPARATOR;

        File file = new File(pagePath);

        if (!file.exists() || file.isDirectory()) {
            return this.notFound(("Page not found!").getBytes());
        }

        byte[] result = null;

        try {
            result = Files.readAllBytes(Paths.get(pagePath));
        } catch (IOException e) {
            return this.internalServerError(("Something went wrong!").getBytes());
        }

        this.httpResponse.addHeader("Content-Type", this.getMimeType(file));

        return this.ok(result);
    }

    private byte[] processGetRequest() {
        if (this.httpRequest.getRequestUrl().equals("/")) {
            return this.processPageRequest("/index");
        }
        return this.processResourceRequest();
    }
}
