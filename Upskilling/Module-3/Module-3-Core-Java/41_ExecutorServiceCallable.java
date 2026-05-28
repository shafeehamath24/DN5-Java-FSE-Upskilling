/* 41. Executor Service and Callable
• Objective: Use concurrency utilities.
• Task: Execute multiple Callable tasks that return results.
• Instructions:
o Use Executors.newFixedThreadPool() and submit() to execute callables.
o Collect results using Future.get(). */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorServiceCallable {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            int taskNumber = i;

            tasks.add(() -> {

                return "Task " + taskNumber +
                        " executed successfully.";

            });
        }

        try {

            List<Future<String>> results = executor.invokeAll(tasks);

            for (Future<String> result : results) {

                System.out.println(result.get());

            }

        } catch (Exception e) {

            System.out.println("Error: " +
                    e.getMessage());

        }

        executor.shutdown();
    }
}