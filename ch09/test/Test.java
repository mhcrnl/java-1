class A {
        private int i = 0;
        void f(String name) {
                synchronized(this) {
                        ++i;
                        System.out.println(i + name + ": f");
                        try {
                                Thread.sleep(1000);
                        }
                        catch (Exception e) {
                                e.printStackTrace();
                        }
                }
        }

        void g(String name) {
                ++i;
                System.out.println(i + name + ": g");
        }
}

class ThreadA extends Thread {
        A a;
        String name;
        ThreadA(A a, String name) {
                this.a = a;
                this.name = name;
        }
        public void run() {
                while(true) {
                        a.f(name);             
                        try {
                                Thread.sleep(1000);
                        }
                        catch (Exception e) {
                                e.printStackTrace();
                        }
                        a.g(name);
                }
        }
}

public class Test {
        public static void main(String[] args) {
                A a = new A();
                ThreadA t1 = new ThreadA(a, "A");
                ThreadA t2 = new ThreadA(a, "B");
                t1.start();
                t2.start();
        }
}
