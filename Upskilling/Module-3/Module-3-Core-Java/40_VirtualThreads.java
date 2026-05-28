/* 40. Virtual Threads (Java 21)
• Objective: Use lightweight threads for scalable concurrency.
• Task: Launch 100,000 virtual threads that each print a message.
• Instructions:
o Use Thread.startVirtualThread(() -> { ... }).
o Measure performance versus traditional threads. */

class VirtualThreads {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {

            int threadNumber = i;

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread: " + threadNumber);

            });
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Execution Time: " +
                (endTime - startTime) +
                " ms");
    }
}