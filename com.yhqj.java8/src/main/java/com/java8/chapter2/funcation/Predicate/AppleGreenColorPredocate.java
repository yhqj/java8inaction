package com.java8.chapter2.funcation.Predicate;

import com.java8.chapter1.lambda.Apple;

public class AppleGreenColorPredocate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
