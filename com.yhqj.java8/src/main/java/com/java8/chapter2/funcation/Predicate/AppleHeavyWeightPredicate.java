package com.java8.chapter2.funcation.Predicate;

import com.java8.chapter1.lambda.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
}
