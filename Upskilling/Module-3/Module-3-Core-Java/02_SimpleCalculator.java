/* 2. Simple Calculator 
• Objective: Practice arithmetic operations and user input. 
• Task: Develop a calculator that performs addition, subtraction, multiplication, and division. 
• Instructions: 
o Prompt the user to enter two numbers. 
o Ask the user to choose an operation. 
o Display the result of the operation. */

class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + product);

        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
