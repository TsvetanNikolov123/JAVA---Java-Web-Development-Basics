package app.http;

import java.util.List;
import java.util.Map;

public interface HttpRequest {

    String getMethod();

    void setMethod(String method);

    String getRequestUrl();

    void setRequestUrl(String requestUrl);

    Map<String, String> getHeaders();

    Map<String, String> getBodyParameters();

    boolean isResource();

    void addHeader(String key, String value);

    void addBodyParameter(String key, String value);

    List<HttpCookie> getCookies();

    void addCookie(HttpCookie cookie);
}
