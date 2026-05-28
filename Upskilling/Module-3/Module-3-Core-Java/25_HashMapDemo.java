/* 25. HashMap Example
• Objective: Use key-value pairs.
• Task: Map student IDs to names.
• Instructions:
o Create a HashMap with Integer keys and String values.
o Allow the user to add entries.
o Retrieve and display a name based on an entered ID. */

import java.util.HashMap;
import java.util.Scanner;

class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("How many students? ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                students.put(id, name);

            }

            System.out.print("\nEnter ID to search: ");
            int searchId = sc.nextInt();

            if (students.containsKey(searchId)) {

                System.out.println("Student Name: " + students.get(searchId));

            } else {

                System.out.println("Student ID not found.");

            }
        }
    }
}