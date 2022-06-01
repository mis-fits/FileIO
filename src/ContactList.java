

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactList extends ContactManager {
    public static Path filepath = Paths.get("src", "contacts.txt");

    public static void displayAllContacts() throws IOException {
        List<String> contacts = Files.readAllLines(filepath);
        System.out.println(contacts);

    }

//    public static void main (String[] args) throws IOException {
//        // create directory & file
//        String directory = "contactlist";
//        String filename = "contacts.txt";
//
//        Path myDirectory = Paths.get(directory);
//        Path myFile = Paths.get(directory, filename);
//        System.out.println(myFile);
//        System.out.println(myDirectory);
//
//        if(Files.notExists(myDirectory)) {
//            Files.createDirectories(myDirectory);
//        }
//
//        if(! Files.exists(myFile)) {
//            Files.createFile(myFile);
//        }
//        writeToFile();
//        readFileContents();
//    }
    // Add content to file
//    public static void writeToFile()  throws IOException {
//        Path filepath = Paths.get("contactlist", "contacts.txt");
//        System.out.println(filepath);
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a new contact: ");
//        String newContact = input.readLine();
////        if (contactType == 1) {
//        System.out.print("First Name: ");
//        firstName = newContact.readLine();
//        System.out.print("Last Name: ");
//        lastName = keyIn.readLine();
//        System.out.print("E-mail address: ");
//        email = keyIn.readLine();
//        System.out.print("Phone number: ");
//        phone = keyIn.readLine();
//
//        List<String> contacts = Arrays.asList("Doe, John - 1234567890");
//
//        Files.write(filepath, contacts, StandardOpenOption.APPEND);
//
//        List<String> fileContents = Files.readAllLines(filepath);
//    }
//
//    public static void readFileContents() throws IOException {
//        Path filepath = Paths.get("contactlist", "contacts.txt");
//        List<String> fileContents = Files.readAllLines(filepath);
//        System.out.println(fileContents);
//    }
}