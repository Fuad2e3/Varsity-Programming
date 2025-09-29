import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("waiting...");

        Socket client = server.accept();
        System.out.println("Connected");

        DataInputStream input = new DataInputStream(client.getInputStream());

        String message = input.readUTF(); 
        System.out.println("Client say: " + message);
     }
}