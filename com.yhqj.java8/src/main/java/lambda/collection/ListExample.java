package lambda.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String str){
                if(str.length()>3){
                    System.out.println(str);
                }
            }
        });

        //我们不需要关心accept方法 也不需要关心Consumer接口
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.forEach(s -> {
            if(s.length()>3){
                System.out.println(s);
            }
        });

        // 使用removeIf()结合匿名名内部类实现
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(new Predicate<String>(){ // 删除长度大于3的元素
            @Override
            public boolean test(String str){
                return str.length()>3;
            }
        });

        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list4.removeIf(s->s.length()>3);

        list.replaceAll(new UnaryOperator<String>(){
            @Override
            public String apply(String str){
                if(str.length()>3)
                    return str.toUpperCase();
                return str;
            }
        });

        list.replaceAll(str -> {
            if(str.length()>3)
                return str.toUpperCase();
            return str;
        });


        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                return str1.length()-str2.length();
            }
        });

        Collections.sort(list,(t1,t2)->t1.length()-t2.length());


    }
}
