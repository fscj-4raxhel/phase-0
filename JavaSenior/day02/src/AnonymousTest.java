public class AnonymousTest {
    public static void main(String[] args) {
        //Anonymous subclass
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("This is an anonymous Subclass");
            }
        }.start();
        Runnable m = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, please move forward to the next order point");
            }
        };
        Thread t2 = new Thread(m);
        t2.start();
    }
}
