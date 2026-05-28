/* 28. Stream API
• Objective: Process collections using streams.
• Task: Filter and display even numbers from a list.
• Instructions:
o Create a List of integers.
o Use the Stream API to filter even numbers.
o Collect and display the result. */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamAPI {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers:");

        evenNumbers.forEach(System.out::println);
    }
}