package app;

import app.constants.Constants;
import app.http.HttpRequest;
import app.http.HttpRequestImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String request = getRequest();

        HttpRequest httpRequest = new HttpRequestImpl(request);

        httpRequest.getCookies().forEach(cookie -> {
            System.out.println(String.format(Constants.OUTPUT_COOKIE_PATTERN, cookie.getKey(), cookie.getValue()));
        });
    }

    private static String getRequest() throws IOException {
        StringBuilder request = new StringBuilder();

        String line;
        while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
            request.append(line).append(System.lineSeparator());
        }

        request.append(System.lineSeparator());
        if ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
            request.append(line);
        }

        return request.toString();
    }
}