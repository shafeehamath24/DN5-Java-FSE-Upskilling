/* 8. Operator Precedence 
• Objective: Explore how Java evaluates expressions. 
• Task: Evaluate and display the result of complex expressions. 
• Instructions: 
o Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;. 
o Display the result and explain the order of operations. */

class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
        int result3 = 20 / 5 + 3 * 4;
        System.out.println("20 / 5 + 3 * 4 = " + result3);
        int result4 = 50 - 10 + 2 * 5;
        System.out.println("50 - 10 + 2 * 5 = " + result4);
        int result5 = 8 + 2 * 3 - 4 / 2;
        System.out.println("8 + 2 * 3 - 4 / 2 = " + result5);
    }
}
