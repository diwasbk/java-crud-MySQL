package myPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Insert data");
            System.out.println("2. Update data");
            System.out.println("3. Retrieve data");
            System.out.println("4. Delete data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Insert data
                    System.out.print("\nEnter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline left-over
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    st.insertData(id, name, email);
                    break;
                case 2:
                    // Update data
                    System.out.print("\nEnter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // Consume newline left-over
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = sc.nextLine();
                    st.updateData(updateId, newName, newEmail);
                    break;
                case 3:
                    // Retrieve data
                    st.readData();
                    break;
                case 4:
                    // Delete data
                    System.out.print("\nEnter ID to delete: ");
                    int deleteId = sc.nextInt();
                    st.deleteData(deleteId);
                    break;
                case 5:
                    // Exit
                    System.out.println("\nExiting program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } while (choice != 5);

        // Close the scanner
        sc.close();
    }
}