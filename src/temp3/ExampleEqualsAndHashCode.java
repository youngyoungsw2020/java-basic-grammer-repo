package temp3;

public class ExampleEqualsAndHashCode {

    public static void main(String args[]) {

        String str1 = "가나다1";
        String str2 = new String("가나다1");

        System.out.println("문자열 출력 1 :: " + str1);
        System.out.println("문자열 출력 2 :: " + str2);

        System.out.println("hashcode1 :: " + str1.hashCode());
        System.out.println("hashcode2 :: " + str2.hashCode());
        System.out.println("str1 hashCode ? " + System.identityHashCode(str1));
        System.out.println("str2 hashCode ? " + System.identityHashCode(str2));

        if (str1 == str2) {
            System.out.println("등호로 비교! :: str1과 str2는 같다.");
        } else {
            System.out.println("등호로 비교! :: str1과 str2는 같지않다.");
        }

        if (str1.hashCode() == str2.hashCode()) {
            System.out.println("hashCode로 비교! :: str1과 str2는 같다.");
        } else {
            System.out.println("hashCode로 비교! :: str1과 str2는 다르다.");
        }

        if (str1.equals(str2)) {
            System.out.println("equlas로 비교! str1과 str2는 같다.");
        } else {
            System.out.println("equlas로 비교! str1과 str2는 다르다.");
        }

    }
}
