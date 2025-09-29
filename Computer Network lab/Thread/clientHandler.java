package com.mycompany.twowaysocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clientHandler extends Thread {
    final Socket soc;
    final DataInputStream dis;
    final DataOutputStream dos;
    public clientHandler(Socket soc,DataInputStream dis,DataOutputStream dos)
    {
        this.soc=soc;
        this.dis=dis;
        this.dos=dos;
    }
    int choice;
    String toRe;
    int a,b;
    @Override
    public void run(){
        while(true)
        {
            try {
                dos.writeUTF("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.MOD\nEnter your choice");
                
                choice=dis.readInt();
                
                dos.writeUTF("Enter Number 1=");
                a=dis.readInt();
                
                dos.writeUTF("Enter Number 2=");
                b=dis.readInt();
                
                switch(choice)
                {
                    case 1:
                        toRe="ADD ="+(a+b);
                        dos.writeUTF(toRe);
                        break;
                                               
                        
                        case 2:
                        toRe="SUB ="+(a-b);
                        dos.writeUTF(toRe);
                        break;
                        
                        case 3:
                        toRe="MUL ="+(a*b);
                        dos.writeUTF(toRe);
                        break;
                        
                        case 4:
                        toRe="DIV ="+(a/b);
                        dos.writeUTF(toRe);
                        break;
                        
                        case 5:
                        toRe="MOD ="+(a%b);
                        dos.writeUTF(toRe);
                        break;
                        
                        default:
                            dos.writeUTF("Enter Correct choice");
                }
            } catch (IOException ex) {
                Logger.getLogger(clientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }}
    