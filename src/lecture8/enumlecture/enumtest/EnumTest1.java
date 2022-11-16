package lecture8.enumlecture.enumtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum EnumTest1 {

    CODE_1("key1임","value1임"),
    CODE_2("key2임","value2임"),
    CODE_3("key3임","value3임"),
    CODE_4("key4임","value4임");

    String key1;
    String value1;

    EnumTest1(String key1, String value1) {
        this.key1 = key1;
        this.value1 = value1;
    }

    private static Map<String, EnumTest1> codes = new HashMap<>();

    // initialization block
    // class initialization block
    static {
        System.out.println("------");
        System.out.println("class initialization block - start");
        Arrays.stream(EnumTest1.values()).forEach(v -> codes.put(v.getKey1(), v));
        System.out.println("class initialization block - end");
        System.out.println("------");
    }

    // instance initialization block
    {
        System.out.println("---");
        System.out.println("instance initialization block - start");
        System.out.println("---");
    }

    public static EnumTest1 codeOf(String key1) {
        return codes.get(key1);
    }

    public String getKey1() {
        return this.key1;
    }

    public void setKey1(String value1) {
        this.value1 = value1;
    }

}
