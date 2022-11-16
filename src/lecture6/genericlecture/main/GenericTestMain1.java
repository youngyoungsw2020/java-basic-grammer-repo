package lecture6.genericlecture.main;

import lecture6.genericlecture.GenericTest1;

class GenericTestMain1 {

    public static void main(String args[]) {

        // generic type 생략
        GenericTest1 test2 = new GenericTest1("샘플입니다.");
        System.out.println(test2.getData());
        System.out.println(test2.getData().getClass());

        // generic type 앞에는 Integer 클래스 두고 생성자에는 문자열 타입적용.
        GenericTest1<Integer> test1 = new GenericTest1("샘플입니다. - generic type 생략");
        System.out.println(test1.getData());

        // error
        //System.out.println(test1.getData().getClass());

    }

}
