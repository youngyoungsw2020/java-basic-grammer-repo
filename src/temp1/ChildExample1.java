package temp1;

import java.util.ArrayList;

public class ChildExample1 {

    public static void main(String args[]) {

        Parent1 parent1 = new Child1();
        parent1.method1();
        parent1.method2();

        Child1 child1 = (Child1)parent1;
        child1.method3();

        Parent1 parent12 = child1;
    }

}
