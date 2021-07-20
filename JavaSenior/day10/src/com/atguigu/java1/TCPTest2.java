package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest2 {
    /*
    Client send a file to server, server save file to its local.
     */

    @Test
    public void clien() throws IOException {

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);

        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream("day10.iml");

        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer))!= -1){
            os.write(buffer,0,len);
        }
        fis.close();
        os.close();
        socket.close();
    }
    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();

        FileOutputStream fos = new FileOutputStream(new File("day10_Copy.iml"));

        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fos.close();
        is.close();
        socket.close();
        ss.close();


    }
}
