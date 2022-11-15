package lecture6.genericlecture;

public class GenericTest3 {

    public <T> T printData(T data) {

        if (data instanceof java.lang.Integer) {
            System.out.println("타입이 Integer 입니다.");
        } else if (data instanceof java.lang.String) {
            System.out.println("타입이 String 입니다.");
        } else {
            System.out.println("타입모르겄는디 ?");
        }

        return data;
    }

    // todo : 확인필요
    // 왜 generic 타입으로 해야하지? 그냥 Object로 하면 안되나
    public Object printData2(Object data) {

        if (data instanceof java.lang.Integer) {
            System.out.println("타입이 Integer 입니다.");
        } else if (data instanceof java.lang.String) {
            System.out.println("타입이 String 입니다.");
        } else {
            System.out.println("타입모르겄는디 ?");
        }

        return data;
    }
}
