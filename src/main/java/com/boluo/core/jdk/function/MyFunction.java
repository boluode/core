package com.boluo.core.jdk.function;

@MyFunctionalInterface
public interface MyFunction<T, R> {

    R apply(T t);
}
