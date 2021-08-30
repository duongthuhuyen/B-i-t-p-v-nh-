package java8.Reference;

import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        int sum = add(1,2,Math::chia);// chính là call back funtion  c
        System.out.println(sum);
        int h = add(3,4,Sub::sub);
        System.out.println(h);
        BiFunction<Integer,Integer,Integer> sub1 = Sub::sub;
        BiFunction<Float, Float, Float> sub2 = Sub::sub;
        System.out.println(sub1.apply(1,2));

    }
    public static int add(int a, int b, ReferenceMethod referenceMethod){
        return referenceMethod.add(a,b);
    }
}
