package Collection.Stack.vd1;

import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<Integer>  stack = new Stack<>();
        int n = 10;
        while (n>0){
            stack.push(n%2);
            n/=2;
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
