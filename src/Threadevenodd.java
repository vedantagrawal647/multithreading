public class Threadevenodd {
    public static void main(String[] args) {
        Runnable r = new A1();
        Thread t1 = new Thread(r);
        t1.start();
        Runnable r1 = new B1();
        Thread t2 = new Thread(r1);
        t2.start();
    }}


class A1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class B1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}


