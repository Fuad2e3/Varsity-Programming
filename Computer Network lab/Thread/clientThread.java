package com.mycompany.twowaysocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class clientThread {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost", 5000); 
            System.out.println("Connection Established");

            DataInputStream dis = new DataInputStream(soc.getInputStream());
            DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
            Scanner input = new Scanner(System.in);

            String rec;
            int num1, num2, choice;

            while (true) {
                rec = dis.readUTF();
                System.out.println(rec);

                choice = input.nextInt();
                dos.writeInt(choice);

                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice or exiting...");
                    break;
                }
                rec = dis.readUTF();
                System.out.println(rec);
                num1 = input.nextInt();
                dos.writeInt(num1);

                rec = dis.readUTF();
                System.out.println(rec);
                num2 = input.nextInt();
                dos.writeInt(num2);

                rec = dis.readUTF();
                System.out.println("Result: " + rec);
            }

            input.close();
            dis.close();
            dos.close();
            soc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    

