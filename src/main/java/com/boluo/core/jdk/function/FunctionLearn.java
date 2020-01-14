package com.boluo.core.jdk.function;

import java.util.function.Function;

/**
 * @author boluo
 */
public class FunctionLearn {

    public static void main(String[] args) {
        Function<String, String> function = t -> t + "哈哈";
        System.out.println(function.apply("111"));

        Function compose = function.compose(t -> t + "compose");
        System.out.println(compose.apply("111"));

        Function andThen = function.andThen(t -> t + "andThen");
        System.out.println(andThen.apply("111"));

        Function identity = Function.identity();
        System.out.println(identity.apply("11"));
    }
}
