//package networkProgramming;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.sql.Driver;
//
//public class NetworkProgramming {
//
//Driver
//    public static void main(String[] args) throws IOException {
//        int port = 8000;
//        ServerSocket serverSocket = new ServerSocket(8000);
//        Socket socket =  serverSocket.accept();
//
//    }
//}
//package ir.maktab;
//
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStream;
//        import java.io.InputStreamReader;
//        import java.net.URL;
//
//public class Main {
//
//    public static String getURLContent(String urlStr) {
//
//        BufferedReader br = null;
//
//        try {
//            URL url = new URL(urlStr);
//// Get the input stream
//            InputStream ins = url.openStream();
//// Wrap input stream into a reader
//            br = new BufferedReader(new InputStreamReader(ins));
//            StringBuilder sb = new StringBuilder();
//            String msg = null;
//            while ((msg = br.readLine()) != null) {
//                sb.append(msg);
//                sb.append("\n"); // Append a new line
//            }
//            return sb.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//// If we get here it means there was an error
//        return null;
//    }
//
//    public static void main(String[] args) {
//
//        String urlStr = "http://google.com";
//
//        String content = getURLContent(urlStr);
//
//        System.out.println(content);
//    }
//}
//
//package ir.maktab;
//
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.io.PrintWriter;
//        import java.net.ServerSocket;
//        import java.net.Socket;
//
//public class Server {
//
//    private ServerSocket serverSocket;
//    private Socket clientSocket;
//
//    private PrintWriter out;
//    private BufferedReader in;
//
//    public void start(int port) throws IOException {
//
//        serverSocket = new ServerSocket(port);
//        System.out.println("Server is running on port: " + port);
//
//        clientSocket = serverSocket.accept();
//        out = new PrintWriter(clientSocket.getOutputStream(), true);
//        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        String greeting = in.readLine();
//
//        if ("hello server".equals(greeting)) {
//            out.println("hello client");
//        } else {
//            out.println("Error !");
//        }
//
//    }
//
//    public void stop() throws IOException {
//        in.close();
//        out.close();
//        clientSocket.close();
//        serverSocket.close();
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Server server = new Server();
//        server.start(8000);
//
//    }
//}
//
//
//
//package ir.maktab;
//
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.io.PrintWriter;
//        import java.net.Socket;
//
//public class Client {
//
//    private Socket clientSocket;
//    private PrintWriter out;
//    private BufferedReader in;
//
//    public void startConnection(String ip, int port) throws IOException {
//
//        clientSocket = new Socket(ip, port);
//        out = new PrintWriter(clientSocket.getOutputStream(), true);
//        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//
//    }
//
//    public String sendMessage(String msg) throws IOException {
//
//        out.println(msg);
//        String resp = in.readLine();
//
//        return resp;
//    }
//
//    public void stopConnection() throws IOException {
//        in.close();
//        out.close();
//        clientSocket.close();
//    }
//
//    public static void main(String[] args) throws IOException {
//        Client client = new Client();
//        client.startConnection("127.0.0.1", 8000);
////        String response = client.sendMessage("hello server");
////        System.out.println(response);
//        System.out.println(client.sendMessage("qwe"));
//    }
//}
