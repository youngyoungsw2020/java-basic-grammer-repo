package lecture10.stringjoiner.main;

import java.util.StringJoiner;

public class StringJoinerTestMain {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("띵");
        sj.add("하하하1");
        sj.add("하하하2");
        sj.add("하하하3");

        System.out.print(sj);

    }
}
