package com.java8.chapter1.lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals("green")) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() >= 150) {
                result.add(apple);
            }
        }
        return result;
    }

    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight()>=150;
    }

    //谓词
    public interface  Predicate<T>{
        boolean test(T t);
    }

    public static List<Apple> filterApples(List<Apple> inventory,Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        filterApples(inventory,(Apple a)->"green".equals(a.getColor()));
        filterApples(inventory,(Apple a)-> a.getWeight()>150);
    }
}
