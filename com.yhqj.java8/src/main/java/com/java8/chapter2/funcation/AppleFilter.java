package com.java8.chapter2.funcation;

import com.java8.chapter1.lambda.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleFilter {

    //2.1.1 first case
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (apple.getColor().equals("green")){
                result.add(apple);
            }
        }
        return result;
    }

    //2.1.2
    public static List<Apple> filterApplesByColor(List<Apple> inventory,String color,int weight){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (apple.getColor().equals(color)&&apple.getWeight()>weight){
                result.add(apple);
            }
        }
        return result;
    }

    //2.1.3



}
