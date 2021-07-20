package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest3 {

    @Test
    public void client() throws IOException {

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);

        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream("day10.iml");

        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer))!= -1){
            os.write(buffer,0,len);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bufferr = new byte[1024];
        int len1;
        while((len1 = is.read(bufferr)) != -1){
            baos.write(bufferr,0,len1);
        }
        System.out.println(baos.toString());

        fis.close();
        os.close();
        socket.close();
        baos.close();
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
        //Server send response
        OutputStream os = socket.getOutputStream();
        os.write("Hello Client, file received".getBytes());


        fos.close();
        is.close();
        socket.close();
        ss.close();
        os.close();
    }
}
