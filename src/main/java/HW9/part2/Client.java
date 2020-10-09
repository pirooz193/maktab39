package HW9.part2;
//// A Java program for a Client
//import java.net.*;
//import java.io.*;
//
//public class Client
//{
//    // initialize socket and input output streams
//    private Socket socket		 = null;
//    private DataInputStream input = null;
//    private DataOutputStream out	 = null;
//
//    // constructor to put ip address and port
//    public Client(String address, int port)
//    {
//        // establish a connection
//        try
//        {
//            socket = new Socket(address, port);
//            System.out.println("Connected");
//
//            // takes input from terminal
//            input = new DataInputStream(System.in);
//
//            // sends output to the socket
//            out = new DataOutputStream(socket.getOutputStream());
//        }
//        catch(UnknownHostException u)
//        {
//            System.out.println(u);
//        }
//        catch(IOException i)
//        {
//            System.out.println(i);
//        }
//
//        // string to read message from input
//        String line = "";
//
//        // keep reading until "Over" is input
//        while (!line.equals("Over"))
//        {
//            try
//            {
//                line = input.readLine();
//                out.writeUTF(line);
//            }
//            catch(IOException i)
//            {
//                System.out.println(i);
//            }
//        }
//
//        // close the connection
//        try
//        {
//            input.close();
//            out.close();
//            socket.close();
//        }
//        catch(IOException i)
//        {
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String args[])
//    {
//        Client client = new Client("127.0.0.1", 5000);
//    }
//}
//

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    ServerSocket serverSocket = null;
    Socket socket = null;
    DataInputStream input = null;
    DataOutputStream output = null;

    public Client(String address, int port) {
        try {
            socket =  new Socket(address,port);
            input = new DataInputStream(System.in) ;
            output = new DataOutputStream(socket.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = "";
        while(line != "over"){
            try {
                line = input.readLine();
                output.writeUTF(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
