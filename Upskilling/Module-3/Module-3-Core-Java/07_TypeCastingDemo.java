/* 7. Type Casting Example 
• Objective: Practice type casting between different data types. 
• Task: Convert a double to an int and vice versa. 
• Instructions: 
o Declare a double variable with a decimal value. 
o Cast it to an int and display the result. 
o Declare an int variable and cast it to a double, then display. */

class TypeCastingDemo {
    public static void main(String[] args) {
        double decimalNumber = 45.78;
        int intNumber = (int) decimalNumber;
        System.out.println("Original double value: " + decimalNumber);
        System.out.println("After casting to int: " + intNumber);
        int wholeNumber = 25;
        double doubleNumber = wholeNumber;
        System.out.println("Original int value: " + wholeNumber);
        System.out.println("After casting to double: " + doubleNumber);
    }
}
