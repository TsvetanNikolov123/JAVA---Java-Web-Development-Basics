package javache;

import javache.http.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RequestHandler {
    private static final String HTML_EXTENSION_AND_SEPARATOR = ".html";
    private HttpRequest httpRequest;
    private HttpResponse httpResponse;

    public RequestHandler() {

    }

    public byte[] handleRequest(String requestContent) {
        this.httpRequest = new HttpRequestImpl(requestContent);
        this.httpResponse = new HttpResponseImpl();

        if (this.httpRequest.getMethod().equals("GET")) {
            return this.processGetRequest();
        }

        return this.ok(new byte[0]);
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

    private byte[] processResourceRequest() {
        String assetPath = WebConstants.ASSETS_FOLDER_PATH + this.httpRequest.getRequestUrl();
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

    private byte[] processPageRequest(String page) {
        String pagePath = WebConstants.PAGES_FOLDER_PATH
                + page
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
        } else if (this.httpRequest.getRequestUrl().equals("/login")) {
            this.httpResponse.addCookie("lang", "en");
            return this.processPageRequest(this.httpRequest.getRequestUrl());
        } else if (this.httpRequest.getRequestUrl().equals("/expire")) {
            this.httpResponse.addCookie("lang", "deleted; expires=Thu, 01 Jan 1970 00:00:00 GMT");
            return this.ok(("Successfully expired").getBytes());
        }

        return this.processResourceRequest();
    }
}
