package main.java.app.web;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HttpResponseImpl implements HttpResponse {

    private Map<String, String> headers;
    private byte[] content;
    private int statusCode;

    public HttpResponseImpl() {
        this.headers = new LinkedHashMap<>();
        this.content = new byte[0];
    }

    @Override
    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.headers);
    }

    @Override
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public byte[] getContent() {
        return content.clone();
    }

    @Override
    public void setContent(byte[] content) {
        this.content = content.clone();
    }

    @Override
    public byte[] getBytes() {
        StringBuilder sb = new StringBuilder();
        switch (getStatusCode()) {
            case 200:
                sb.append("HTTP/1.1 ").append(200).append(" OK");
                break;
            case 400:
                sb.append("HTTP/1.1 ").append(400).append(" Bad Request");
                break;
            case 401:
                sb.append("HTTP/1.1 ").append(401).append(" Unauthorized");
                break;
            case 404:
                sb.append("HTTP/1.1 ").append(404).append(" Not Found");
                break;
        }
        sb.append(System.lineSeparator());
        getHeaders().forEach((key, value) ->
                sb.append(key)
                        .append(": ")
                        .append(value)
                        .append(System.lineSeparator()));
        sb.append(System.lineSeparator())
                .append(new String(getContent()));


        return sb.toString().getBytes();
    }

    @Override
    public void addHeader(String header, String value) {
        if (!header.equals("Authorization")) {
            this.headers.put(header, value);
        }
    }
}
