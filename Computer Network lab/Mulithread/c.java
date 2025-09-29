
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class c {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 5000);
        System.out.println("Connected to server.");

        DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
        DataInputStream inputStream = new DataInputStream(client.getInputStream());
        Scanner scn = new Scanner(System.in);

        String str = "";
        while (!str.equalsIgnoreCase("exit")) {
            str = scn.nextLine();
            str=str.toUpperCase();
            outputStream.writeUTF(str);

            System.out.println("Server sent: " + inputStream.readUTF());
        }
        client.close();
    }
}