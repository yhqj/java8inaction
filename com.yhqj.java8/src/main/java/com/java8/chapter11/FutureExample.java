package com.java8.chapter11;

import java.util.concurrent.*;
import java.util.function.Function;

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executorService  = Executors.newCachedThreadPool();
        Future<Double> function =executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return 1.0;
            }
        });
        //doSomeThingelse
        try {
            Double result = function.get(1, TimeUnit.MICROSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
