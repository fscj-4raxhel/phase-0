package com.atguigu.java;

public class Order <T>{

    String orderName;
    int orderId;

    //The inner structures of this class can now use Generic Type T

    T orderT;

    public Order(){};

    public Order(String orderName, int orderId, T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;


    }


}
