/* 24. ArrayList Example
• Objective: Use dynamic arrays.
• Task: Manage a list of student names.
• Instructions:
o Create an ArrayList to store names.
o Allow the user to add names to the list.
o Display all names entered. */

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("How many students? ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter student name " + i + ": ");
                String name = sc.nextLine();

                students.add(name);

            }

            System.out.println("\nStudent Names:");

            for (String student : students) {

                System.out.println(student);

            }
        }
    }
}