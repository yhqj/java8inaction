package lambda.class1;

import java.util.List;

public class MyStream<T> {
    private List<T> list;

    public void myForEach(ConsumerInterface<T> consumer){// 1
        for(T t : list){
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        MyStream<String> stream = new MyStream<String>();
        stream.myForEach(str -> System.out.println(str));// 使用自定义函数接口书写Lambda表达式
    }
}
