/* 22. File Writing
• Objective: Write data to a file.
• Task: Write user input to a text file.
• Instructions:
o Prompt the user for a string.
o Write the string to a file named output.txt.
o Confirm that the data has been written. */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileWriting {

    public static void main(String[] args) {

        try (
                Scanner sc = new Scanner(System.in);
                FileWriter writer = new FileWriter("output.txt")) {

            System.out.print("Enter text to write into file: ");
            String text = sc.nextLine();

            writer.write(text);

            System.out.println("Data written successfully into output.txt");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}