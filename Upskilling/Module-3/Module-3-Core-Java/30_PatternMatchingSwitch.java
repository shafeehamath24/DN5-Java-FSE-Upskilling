/* 30. Pattern Matching for switch (Java 21)
• Objective: Simplify conditional logic with pattern matching in enhanced switch expressions.
• Task: Determine the type of an object and respond accordingly.
• Instructions:
o Create a method that accepts Object as input.
o Use a switch expression to check if the object is Integer, String, Double, etc.
o Print a message based on the object’s type. */

class PatternMatchingSwitch {

    static void checkType(Object obj) {

        switch (obj) {

            case Integer i ->
                System.out.println("Integer Value: " + i);

            case String s ->
                System.out.println("String Value: " + s);

            case Double d ->
                System.out.println("Double Value: " + d);

            default ->
                System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args) {

        checkType(100);
        checkType("Hello Java");
        checkType(99.99);
    }
}