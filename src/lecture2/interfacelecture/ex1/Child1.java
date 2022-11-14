package lecture2.interfacelecture.ex1;

public class Child1 implements Parent1{

    @Override
    public void method1() {
        System.out.println("method1입니다.");
    }

    @Override
    public void method2() {
        System.out.println("method2입니다.");
    }

    public void method3() {
        System.out.println("method3입니다.");
    }
}
