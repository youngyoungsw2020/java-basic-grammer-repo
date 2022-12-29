package lecture11.threadtest.main;

import lecture11.threadtest.Thread1;
import lecture11.threadtest.Thread2;
import lecture11.threadtest.Thread3;

public class ThreadMain {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.run();

    }

}
