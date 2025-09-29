package com.mycompany.twowaysocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class serverThread {
    public static void main(String[] args ){
        try{
            ServerSocket ss=new ServerSocket(5000);
            System.out.println("Waiting for client");
            
            while(true)
            {
                Socket soc=ss.accept();
                System.out.println("A new client connect at "+soc);
                
                DataInputStream dis=new DataInputStream(soc.getInputStream());
                DataOutputStream dos=new DataOutputStream (soc.getOutputStream());
                
                System.out.println("A new thread assign");
                
                Thread newThread=new clientHandler (soc,dis,dos);
                newThread.start();
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
    }
    
}
}

