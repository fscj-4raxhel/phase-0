package com.atguigu.java;

interface ClothFactory {
    void produceCloth();
}

class ProxyClothFactory implements ClothFactory{


    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory){
        this. factory = factory;
    }
    @Override
    public void produceCloth() {
        System.out.println("Proxy Factory preparing");
        factory.produceCloth();
        System.out.println("Proxy Factory wrapping up");
    }
}

class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {

        System.out.println("Nike factory producing clothes");
    }
}

