package lecture4.hashcode.main;

public class CompareTest1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1 == str3 ? " + (str1 == str3));

        System.out.println("str1 hashCode ? " + System.identityHashCode(str1));
        System.out.println("str2 hashCode ? " + System.identityHashCode(str2));
        System.out.println("str3 hashCode ? " + System.identityHashCode(str3));
    }
}
