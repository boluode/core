package com.boluo.core.jdk.function;

public class MyFunctionLearn {

    public static void main(String[] args) {

        MyFunction<String, String> myFunction = t -> t + "哈哈哈";
        System.out.println(myFunction.apply("111"));
    }
}
