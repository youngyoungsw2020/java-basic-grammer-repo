package temp2;

import temp1.Child1;
import temp1.Parent1;

import java.util.ArrayList;
import java.util.Stack;

public class StackExample1 {

    public static void main(String args[]) {

        ArrayList test = new ArrayList();
        java.util.Stack<String> stack1 = new Stack<String>();
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");
        stack1.push("4");
        stack1.push("5");
        stack1.push("6");
        stack1.push("7");
        stack1.push("8");
        stack1.push("9");
        stack1.push("10");
        stack1.push("11");

        System.out.println(stack1.capacity());
        System.out.println(stack1.size());





    }

}
