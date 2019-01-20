package main.java.app.web;

import java.util.*;

public class HttpRequestImpl implements HttpRequest {

    private Map<String, String> headers;
    private Map<String, String> bodyParameters;
    private String method;
    private String requestUrl;

    public HttpRequestImpl(String request) {
        this.headers = new LinkedHashMap<>();
        this.bodyParameters = new LinkedHashMap<>();
        parseRequest(request);
    }

    private void parseRequest(String request) {
        List<String> requestLines = Arrays.asList(request.split(System.lineSeparator()));
        if (requestLines.isEmpty()) {
            return;
        }

        String[] tokens = requestLines.get(0).split(" ");
        setMethod(tokens[0]);
        setRequestUrl(tokens[1]);

        parseHeaders(requestLines);
        parseBodyParameters(requestLines);
    }

    private void parseHeaders(List<String> requestLines) {
        requestLines
                .stream()
                .skip(1)
                .filter(h -> h.contains(": "))
                .map(header -> header.split(": "))
                .forEach(headersKvp -> {
                    addHeader(headersKvp[0], headersKvp[1]);
                });
    }

    private void parseBodyParameters(List<String> requestLines) {

        if (!requestLines.get(requestLines.size() - 2).equals("")) {
            return;
        }

        Arrays.stream(requestLines.get(requestLines.size() - 1)
                .split("&"))
                .map(bodyParameter -> bodyParameter.split("="))
                .forEach(bpKvp -> {
                    addBodyParameter(bpKvp[0], bpKvp[1]);
                });
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
    public void addHeader(String header, String value) {
        this.headers.put(header, value);
    }

    @Override
    public void addBodyParameter(String parameter, String value) {
        this.bodyParameters.put(parameter, value);
    }

    @Override
    public boolean isResource() {
        return requestUrl.contains(".");
    }
}
