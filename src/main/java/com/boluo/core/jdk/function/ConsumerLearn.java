package com.boluo.core.jdk.function;

import java.util.function.Consumer;

/**
 * @author boluo
 */
public class ConsumerLearn {

    public static void main(String[] args) {

        Consumer<String> add = t -> System.out.println(t + "! ! !");
        String boluo = " 1菠 萝欢迎 你 ";
        add.accept(boluo);

        System.out.println("------------------------------------------------");

        boluo = " 2菠 萝欢迎 你 ";
        Consumer<String> addThenReplace = add.andThen(t -> System.out.println(t.replace(" ", "")));
        addThenReplace.accept(boluo);
    }
}
