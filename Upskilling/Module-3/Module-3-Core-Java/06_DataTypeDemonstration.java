/* 6. Data Type Demonstration
• Objective: Understand Java's primitive data types.
• Task: Declare variables of different primitive types and display their values.
• Instructions:
o Declare variables of types int, float, double, char, and boolean.
o Assign appropriate values to each.
o Use System.out.println() to display each variable.*/

class DataTypeDemonstration {
    public static void main(String[] args) {
        int age = 20;
        float height = 5.9f;
        double salary = 45000.75;
        char grade = 'A';
        boolean isStudent = true;
        System.out.println("Integer value: " + age);
        System.out.println("Float value: " + height);
        System.out.println("Double value: " + salary);
        System.out.println("Character value: " + grade);
        System.out.println("Boolean value: " + isStudent);
    }
}