package lecture11.threadtest;

public class Thread1 extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            try {
                System.out.print("(1)");
                sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
