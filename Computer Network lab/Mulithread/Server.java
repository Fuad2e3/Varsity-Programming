import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Waiting for client...");

       int counter = 1;


        while (counter<=5) {
            counter++;
            Socket client = server.accept();
            System.out.println("Connected client: " + client.getPort());

            new Thread(() -> {
                try {
                    DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
                    DataInputStream inputStream = new DataInputStream(client.getInputStream());
                    Scanner scn = new Scanner(System.in);

                    String str = "";
                    while (!str.equalsIgnoreCase("exit")) {
                        str = inputStream.readUTF();
                        String text = scn.nextLine();
                        outputStream.writeUTF(text);
                        System.out.println("Client " + client.getPort() + " sent: " + str);

                       
                    }
                    client.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } ).start();

        }
        server.close();
        System.out.println("Server closed.");
    }
}