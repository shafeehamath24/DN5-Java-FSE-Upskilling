/* 15. String Reversal 
• Objective: Manipulate strings. 
• Task: Reverse a string entered by the user. 
• Instructions: 
o Prompt the user for a string. 
o Use a loop or StringBuilder to reverse the string. 
o Display the reversed string.  */

import java.util.*;

class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
