package com.boluo.core.jdk.function;

import java.util.function.Supplier;

/**
 * @author boluo
 */
public class SupplierLearn {

    public static void main(String[] args) {
        Supplier<String> get = () -> "菠萝";
        System.out.println(get.get());
    }
}
