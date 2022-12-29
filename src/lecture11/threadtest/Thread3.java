package lecture11.threadtest;

public class Thread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("(3)");
        }
    }
}
