package com.boluo.core.jdk.function;

import com.google.common.base.Strings;

import java.util.function.Predicate;

/**
 * @author boluo
 */
public class PredicateLearn {

    public static void main(String[] args) {
        Predicate<String> predicate = Strings::isNullOrEmpty;
        System.out.println(predicate.test(""));

        Predicate<String> or = predicate.or(t -> !Strings.isNullOrEmpty(t));
        System.out.println(or.test(""));

        Predicate<String> and = predicate.and(t -> !Strings.isNullOrEmpty(t));
        System.out.println(and.test(""));

        Predicate<String> negate = predicate.negate();
        System.out.println(negate.test(""));

        System.out.println(Predicate.isEqual("").test(""));
    }
}
