package lecture5.list.main;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ListTestMain {
    public static void main(String[] args) {

        String str1 = "문자열";
        Character chr1 = new Character('A');
        Float float1 = 3.4f;  // 실수형 4byte
        Double double1 = 0.4; // 실수형 8byte

        System.out.println("문자열 :: " + str1);
        System.out.println("캐릭터형 :: " + chr1);
        System.out.println("실수형 4byte primitive type :: " + float1);
        System.out.println("실수형 8byte primitive type :: " + double1);
        System.out.println("");

        ArrayList<Object> list = new ArrayList<Object>();
        list.add(str1);
        list.add(chr1);
        list.add(float1);
        list.add(double1);

        AtomicInteger i = new AtomicInteger();
        Integer ii;
        list.stream().forEach(v -> {
            System.out.println("i :: " + i.getAndIncrement());
            System.out.println("class :: " + v.getClass().getSimpleName());
            System.out.println("value :: " + v);
            System.out.println("");
        });

    }
}
