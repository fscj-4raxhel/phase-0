package com.atguigu.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    /**
     * TCP/IP 参考模型分为四层
     */

    public static void main(String[] args) {
        try {
            InetAddress.getByName("192.168.10.14");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
