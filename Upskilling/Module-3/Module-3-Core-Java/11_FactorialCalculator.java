/* 11. Factorial Calculator 
• Objective: Use loops to perform repetitive calculations. 
• Task: Calculate the factorial of a number entered by the user. 
• Instructions: 
o Prompt the user for a non-negative integer. 
o Use a for loop to calculate the factorial. 
o Display the result. */

import java.util.*;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        long factorial = 1;
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        sc.close();
    }
}
