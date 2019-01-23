package app.http;

import app.constants.Constants;

import java.util.*;

public class HttpRequestImpl implements HttpRequest {
    private String method;
    private String requestUrl;
    private Map<String, String> headers;
    private Map<String, String> bodyParameters;
    private List<HttpCookie> cookies;
    private Boolean isResource;

    public HttpRequestImpl(String request) {
        init(request);
    }

    private void init(String request) {
        this.headers = new LinkedHashMap<>();
        this.bodyParameters = new LinkedHashMap<>();
        this.setMethod(request.split(Constants.HTTP_REQUEST_SPLIT_DELIMITER)[0]);
        this.setRequestUrl(request.split(Constants.HTTP_REQUEST_SPLIT_DELIMITER)[1]);
        this.cookies = new ArrayList<>();

        String[] requestParams = request.split(System.lineSeparator());
        Arrays.stream(requestParams)
                .skip(1)
                .filter(headerKvp -> headerKvp.contains(Constants.HTTP_REQUEST_HEADER_DELIMITER))
                .forEach(headerKvp -> {
                    String[] header = headerKvp.split(Constants.HTTP_REQUEST_HEADER_DELIMITER);
                    this.addHeader(header[0], header[1]);
                });

        if (!requestParams[requestParams.length - 1].isEmpty() && requestParams[requestParams.length - 2].isEmpty()) {
            Arrays.stream(requestParams[requestParams.length - 1].split(Constants.HTTP_REQUEST_BODY_DELIMITER))
                    .forEach(bodyKvp -> {
                        String[] body = bodyKvp.split(Constants.HTTP_REQUEST_BODY_KVP_DELIMITER);
                        this.addBodyParameter(body[0], body[1]);
                    });
        }

        if (this.headers.containsKey(Constants.HTTP_HEADER_COOKIE)) {
            String cookie = this.headers.get(Constants.HTTP_HEADER_COOKIE);
            Arrays.stream(cookie.split(Constants.HTTP_REQUEST_HEADER_COOKIE_DELIMITER)).forEach(cookieKvp -> {
                String[] cookieParams = cookieKvp.split(Constants.HTTP_REQUEST_BODY_KVP_DELIMITER);
                HttpCookie httpCookie = new HttpCookieImpl(cookieParams[0], cookieParams[1]);
                this.addCookie(httpCookie);
            });
        }
    }

    @Override
    public String getMethod() {
        return this.method;
    }

    @Override
    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Override
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Override
    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.headers);
    }

    @Override
    public Map<String, String> getBodyParameters() {
        return Collections.unmodifiableMap(this.bodyParameters);
    }

    @Override
    public boolean isResource() {
        return this.getRequestUrl().contains(".");
    }

    @Override
    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    @Override
    public void addBodyParameter(String key, String value) {
        this.bodyParameters.put(key, value);
    }

    @Override
    public List<HttpCookie> getCookies() {
        return this.cookies;
    }

    @Override
    public void addCookie(HttpCookie cookie) {
        this.cookies.add(cookie);
    }
}
