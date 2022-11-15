package lecture6.genericlecture.testmain;

import lecture6.genericlecture.GenericTest2;

class GenericTestMain2 {

    public static void main(String args[]) {
        GenericTest2 test2 = new GenericTest2();
        int a = 3;
        test2.setData(a);
        System.out.println(test2.getData());
    }

}
