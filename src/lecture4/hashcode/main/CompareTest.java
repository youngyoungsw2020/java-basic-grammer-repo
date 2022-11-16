package lecture4.hashcode.main;

public class CompareTest {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = new String("abcd");

        if(s1 == s2) {
            System.out.println("두개의 값이 같습니다.");
        }else {
            System.out.println("두개의 값이 같지 않습니다.");
        }
    }
}
