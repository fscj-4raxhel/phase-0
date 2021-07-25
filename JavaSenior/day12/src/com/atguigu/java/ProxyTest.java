package com.atguigu.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
Dynamic proxy
 */
interface Human{
    String getBelief();
    void eat(String food);
}
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("I would like to eat" + food);
    }
}
/*要想实现动态代理，需要解决什么问题？
问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法。
*/

class ProxyFactory{
    //通过调用此方法，返回一个代理类的对象
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}
class MyInvocationHandler implements InvocationHandler{

    private Object obj;//需要使用被代理类的对象进行复制

    public void bind(Object obj){
        this.obj = obj;
    }
    //当我们通过代理类的对象调用方法a时，就会自动的调用如下的方法invoke()
    //将被代理类要执行的方法a的功能生命在`invoke`中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //mothod 即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj
        Object returnValue = method.invoke(obj,args);
        return returnValue;
    }
}
public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        ///proxyInstance:代理类的对象
        Human proxyInstance = (Human)ProxyFactory.getProxyInstance(superMan);
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("ma la tang");

        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory proxyClothFactory = (ClothFactory)ProxyFactory.getProxyInstance(nikeClothFactory);
        proxyClothFactory.produceCloth();

    }

}
