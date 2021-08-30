package Collection.Stack.vd1;

import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "{()}(())";
        char []ss = s.toCharArray();
        boolean check = true;
        for(int i = 0;i<ss.length;i++){
            if(ss[i]=='('||ss[i]=='{'||ss[i]=='['){
                stack.push(ss[i]);
            }else{
                if(stack.empty()){
                    check = false;
                    break;
                }
                char c = stack.peek();
                System.out.println(c+" "+ss[i]);
                System.out.println(c == ss[i]);
                if( c == ss[i]){
                    stack.pop();
                }else{
                    check = false;
                    break;
                }
            }
        }
        if( !stack.empty()) {
            check = false;
        }
        if(!check){
            System.out.println("Biểu thức không hợp lệ ");
        }else{
            System.out.println("Biểu thức hợp lệ ");
        }

    }
}
