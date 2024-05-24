import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App implements Runnable {

    class BasicHttpHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello, World!";

            // Response status and length
            exchange.sendResponseHeaders(200, response.length());

            // Output the response
            try (OutputStream stream = exchange.getResponseBody()) {
                stream.write(response.getBytes());
            }
        }
    }

    HttpServer server;

    public App(int port) throws IOException {
        this.server = createServer(port);
    }

    private HttpServer createServer(int port) throws IOException {
        System.out.println("App.createServer port=" + port);
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new BasicHttpHandler());
        return server;
    }

    @Override
    public void run() {
        System.out.println("App.run");
        server.start();
    }

    public static void main(String[] args) {
        try {
            App a = new App(8080);
            a.run();
        } catch (Exception e) {
            System.out.println("App.main " + e);
        }
    }
}
