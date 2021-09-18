package javache;

import javache.api.RequestHandler;
import javache.io.Reader;
import javache.io.Writer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Set;

public class ConnectionHandler extends Thread {
    private static final int CONNECTION_KILL_LIMIT = 20000;

    private Socket clientSocket;
    private InputStream clientSocketInputStream;
    private OutputStream clientSocketOutputStream;
    private Set<RequestHandler> requestHandlers;

    public ConnectionHandler(Socket clientSocket, Set<RequestHandler> requestHandlers) {
        this.initializeConnection(clientSocket);
        this.requestHandlers = requestHandlers;
    }

    private void initializeConnection(Socket clientSocket) {
        try {
            this.clientSocket = clientSocket;
            this.clientSocketInputStream = this.clientSocket.getInputStream();
            this.clientSocketOutputStream = this.clientSocket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String requestContent = Reader.readAllLines(this.clientSocketInputStream);

            int connectionReadTimer = 0;

            while (connectionReadTimer++ < CONNECTION_KILL_LIMIT) {

                if (requestContent.length() > 0) {
                    break;

                    // todo 46:52
                }
            }

            byte[] responseContent = null;

            for (RequestHandler requestHandler : this.requestHandlers) {
                responseContent = requestHandler.handleRequest(requestContent);

                if (requestHandler.hasIntercepted()) {
                    break;
                }
            }

            Writer.writeBytes(responseContent, this.clientSocketOutputStream);
            this.clientSocketInputStream.close();
            this.clientSocketOutputStream.close();
            this.clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






