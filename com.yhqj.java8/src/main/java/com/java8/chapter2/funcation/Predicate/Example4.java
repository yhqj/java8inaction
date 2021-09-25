package com.java8.chapter2.funcation.Predicate;

import com.java8.chapter1.lambda.Apple;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){

        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
