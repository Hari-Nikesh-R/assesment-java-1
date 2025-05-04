package org.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    private static void printHello() {
        System.out.println("Hey this is hari!");
    }

    // Synchronous
    // Asynchronous
    // Main

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Callable<String> task = () -> {
            return "Hello World!";
        };
        Future<String> future = executor.submit(task);
        System.out.println(future.get());
        executor.shutdown();
    }
}