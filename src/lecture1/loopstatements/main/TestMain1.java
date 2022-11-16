package lecture1.loopstatements.main;

import java.io.IOException;

public class TestMain1 {

    public static void main(String[] args) throws IOException {

        int i = 1;
        ext:while(true) {
            switch(i) {
                case 1:
                    // 어쩌구저쩌구
                    System.out.println("case 1 :: " + i);
                    i++;
                    break;
                case 2:
                    // 어쩌구저쩌구
                    System.out.println("case 2 :: " + i);
                    i++;
                    break;
                default:
                    System.out.println("case default :: " + i);
                    break ext;
            }
        }

    }

}
