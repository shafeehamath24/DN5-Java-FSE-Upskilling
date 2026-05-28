/* 16. Palindrome Checker 
• Objective: Combine string manipulation and conditional logic. 
• Task: Check if a string is a palindrome. 
• Instructions: 
o Prompt the user for a string. 
o Remove any non-alphanumeric characters and convert to lowercase. 
o Check if the string reads the same forwards and backwards. 
o Display the result.  */

import java.util.*;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        if (cleanedText.equals(reversedText)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
