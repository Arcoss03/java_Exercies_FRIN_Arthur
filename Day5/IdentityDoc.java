package Day5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IdentityDoc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a solution (1 or 2):");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                solution1(scanner);
                break;
            case 2:
                solution2(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }

    // solution 1: Fixed length strings for name and surname
    public static void solution1(Scanner scanner) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("identityDoc_fixed.txt"))) {
            while (true) {
                System.out.println("Enter name (or type '' to finish):");
                final String name = scanner.nextLine();
                if (name.trim().equals("")) break; //check blank string to exit

                System.out.println("Enter surname:");
                final String surname = scanner.nextLine();

                System.out.println("Enter year of birth:");
                final String yearOfBirth = scanner.nextLine();
                scanner.nextLine();

                //Ensure the name and surname are 20 characters long
                final String recordName= String.format("%-20s", name);
                final String recordSurname = String.format("%-20s", surname);
                final String recordYearOfBirth = String.format("%-4s", yearOfBirth);

                // Write to the binary file
                dos.writeBytes(recordName);
                dos.writeBytes(recordSurname);
                dos.writeBytes(recordYearOfBirth);
                dos.writeBytes("\n"); //end of record
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // solution 2: UTF-8 encoded strings for name and surname
    public static void solution2(Scanner scanner) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("identityDoc_utf8.txt"))) {
            while (true) {
                System.out.println("Enter name (or type '' to finish):");
                final String name = scanner.nextLine();
                if (name.trim().equals("")) break;

                System.out.println("Enter surname:");
                final String surname = scanner.nextLine();

                System.out.println("Enter year of birth:");
                final String yearOfBirth = scanner.nextLine();
                scanner.nextLine();

                //char for separation and end of line
                final String returnChar = "\n";
                final String separatorChar = ";";

                // Convert name and surname to UTF-8 bytes
                byte[] nameBytes = name.trim().getBytes(StandardCharsets.UTF_8);
                byte[] surnameBytes = surname.trim().getBytes(StandardCharsets.UTF_8);
                byte[] yearOfBirthBytes = yearOfBirth.trim().getBytes(StandardCharsets.UTF_8);
                byte[] returnCharBytes = returnChar.getBytes(StandardCharsets.UTF_8);
                byte[] separatorCharBytes = separatorChar.getBytes(StandardCharsets.UTF_8);

                // Write lengths and then the strings                dos.write(nameBytes);
                dos.write(surnameBytes);
                dos.write(separatorCharBytes);
                dos.write(nameBytes);
                dos.write(separatorCharBytes);
                dos.write(yearOfBirthBytes);
                dos.write(returnCharBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
