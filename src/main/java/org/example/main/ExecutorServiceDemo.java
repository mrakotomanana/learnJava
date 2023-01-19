package org.example.main;

import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Set<Callable<String>> setTask = Sets.newHashSet();
        setTask.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "callable one";
            }
        });
        setTask.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "callable two";
            }
        });
        exec.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute task");
            }
        });
        exec.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Submit task");
            }
        });
        String value = exec.invokeAny(setTask);
        System.out.println("Value : " + value);
        List<Future<String>> futures = exec.invokeAll(setTask);
        for (Future<String> future : futures) {
            System.out.println("future : " + future.get());
        }
        exec.shutdown();
        System.out.println("Main methode");
        System.out.println("is shutdown : " + exec.isShutdown());
    }
}
