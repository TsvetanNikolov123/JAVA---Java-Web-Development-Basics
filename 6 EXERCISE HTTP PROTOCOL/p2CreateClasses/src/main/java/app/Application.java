package main.java.app;

import main.java.app.web.HttpRequest;
import main.java.app.web.HttpRequestImpl;
import main.java.app.web.HttpResponse;
import main.java.app.web.HttpResponseImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class Application {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Paste the input from previous task: ");

        List<String> validUrls = getValidUrls();
        StringBuilder builder = new StringBuilder();

        requestLinesToString(builder);
        HttpRequest request = new HttpRequestImpl(builder.toString());
        HttpResponse response = new HttpResponseImpl();

        if (!validUrls.contains(request.getRequestUrl())) {
            response.setStatusCode(404);
            response.addHeader("Host", request.getHeaders().get("Host"));
            response.setContent("The requested functionality was not found.".getBytes());
        } else if (!request.getHeaders().containsKey("Authorization")) {
            response.setStatusCode(401);
            response.addHeader("Host", request.getHeaders().get("Host"));
            response.setContent("You are not authorized to access the requested functionality.".getBytes());
        } else if (!request.getMethod().equals("Post") && request.getBodyParameters().size() == 0) {
            response.setStatusCode(400);
            response.addHeader("Host", request.getHeaders().get("Host"));
            response.setContent("There was an error with the requested functionality due to malformed request.".getBytes());
        } else {
            response.setStatusCode(200);
            request.getHeaders().forEach(response::addHeader);
            String name = new String(Base64
                    .getDecoder()
                    .decode(request.getHeaders().get("Authorization").split("\\s+")[1]));

            String first = "";
            String second = "";
            String third = "";
            int count = 0;
            for (Map.Entry<String, String> kvp : request.getBodyParameters().entrySet()) {
                switch (count) {
                    case 0:
                        first = kvp.getValue();
                        break;
                    case 1:
                        second = kvp.getKey() + " - " + kvp.getValue();
                        break;
                    case 2:
                        third = kvp.getKey() + " - " + kvp.getValue();
                        break;
                }

                count++;
            }
            String content = String.format("Greetings %s! You have successfully created %s with %s, %s.",
                    name, first, second, third);

            response.setContent(content.getBytes());
        }

        System.out.println(new String(response.getBytes()));
    }

    private static void requestLinesToString(StringBuilder request) throws IOException {
        String line = null;
        while ((line = reader.readLine()) != null && line.length() > 0) {
            request.append(line).append(System.lineSeparator());
        }

        request.append(System.lineSeparator());
        if ((line = reader.readLine()) != null && line.length() > 0) {
            request.append(line).append(System.lineSeparator());
        }
    }

    private static List<String> getValidUrls() throws IOException {
        return Arrays.asList(reader.readLine().split("\\s+"));
    }
}
