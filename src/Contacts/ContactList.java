package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactList extends Contact{
    public ContactList(String firstName, String lastName, String email, String phone) {
        super(firstName, lastName, email, phone);
    }

    public static void main (String[] args) throws IOException {
        // create directory & file
        String directory = "contactlist";
        String filename = "contacts.txt";

        Path myDirectory = Paths.get(directory);
        Path myFile = Paths.get(directory, filename);
        System.out.println(myFile);
        System.out.println(myDirectory);

        if(Files.notExists(myDirectory)) {
            Files.createDirectories(myDirectory);
        }

        if(! Files.exists(myFile)) {
            Files.createFile(myFile);
        }
        writeToFile();
        readFileContents();
    }
    // Add content to file
    public static void writeToFile()  throws IOException {
        Path filepath = Paths.get("contactlist", "contacts.txt");
        System.out.println(filepath);


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a new contact: ");
        int newContact = input.nextInt();
//        if (contactType == 1) {
        System.out.print("First Name: ");
        firstName = newContact.readLine();
        System.out.print("Last Name: ");
        lastName = keyIn.readLine();
        System.out.print("E-mail address: ");
        email = keyIn.readLine();
        System.out.print("Phone number: ");
        phone = keyIn.readLine();

        List<String> contacts = Arrays.asList("Doe, John - 1234567890");

        Files.write(filepath, contacts, StandardOpenOption.APPEND);

        List<String> fileContents = Files.readAllLines(filepath);
    }

    public static void readFileContents() throws IOException {
        Path filepath = Paths.get("contactlist", "contacts.txt");
        List<String> fileContents = Files.readAllLines(filepath);
        System.out.println(fileContents);
    }
}
//package Contacts;
//
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//public class ContactList {
//
//    /*ArrayList<List.Contact> contactlist;*/
//
//    List<Contact> contactlist = new ArrayList<>();
//
//
//    /* Contact contact; */
//    private int top = 0;
//
//    public static void main(String[] args) throws IOException {
//        /* Contact contact;
//        contact = new Contact();
//        List.Contact c;
//        c = contact; */
//        ContactList list = new ContactList();
//
//        BufferedReader keyIn;
//        keyIn = new BufferedReader(new InputStreamReader(System.in));
//        String choose = "";
//        while (true) {
//
//            System.out.println("\n[1] Add contact");
//            System.out.println("[2] View all contacts");
//            System.out.println("[3] Quit");
//            System.out.print("Choose : ");
//
//            try {
//                choose = keyIn.readLine();
//            } catch (IOException e) {
//
//                System.out.println("Error");
//            }
//            switch (choose) {
//                case "1":
//                    list.addContact();
//                    break;
////                case "2":
////                    list.viewContacts();
////                    break;
//                case "2":
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Error");
//                    break;
//            }
//
//        }
//    }
//
//
//    public ContactList() {
//        this.contactlist = new ArrayList<>();
//    }
//
//    public void addContact() throws IOException {
//        BufferedReader keyIn;
//        keyIn = new BufferedReader(new InputStreamReader(System.in));
//        String firstName;
//        String lastName;
//        String address;
//        String email;
//        String phone;
//        String jobTitle;
//        String organization;
//        String dateOfBirth;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter Specify the contact type (1) Personal or (2) Business: ");
//        int contactType = input.nextInt();
//        if (contactType == 1) {
//            System.out.print("First Name: ");
//            firstName = keyIn.readLine();
//            System.out.print("Last Name: ");
//            lastName = keyIn.readLine();
////            System.out.print("Address: ");
////            address = keyIn.readLine();
//            System.out.print("E-mail address: ");
//            email = keyIn.readLine();
//            System.out.print("Phone number: ");
//            phone = keyIn.readLine();
////            System.out.print("Date of Birth (MM/DD/YYYY): ");
////            dateOfBirth = keyIn.readLine();
//
//            PersonalContact entry;
//            entry = new PersonalContact(firstName, lastName,  email, phone);
//            contactlist.add(entry);
//            top++;
//            try {
//                entry.write();
//            } catch (Exception e) {
//            }
//
//        } else if (contactType == 2) {
//            System.out.print("First Name: ");
//            firstName = keyIn.readLine();
//            System.out.print("Last Name: ");
//            lastName = keyIn.readLine();
////            System.out.print("Address: ");
////            address = keyIn.readLine();
//            System.out.print("E-mail address: ");
//            email = keyIn.readLine();
//            System.out.print("Phone number: ");
//            phone = keyIn.readLine();
////            System.out.print("Job Title: ");
////            jobTitle = keyIn.readLine();
////            System.out.print("Organization: ");
////            organization = keyIn.readLine();
//
////            BusinessContact entry;
////            entry = new BusinessContact(firstName, lastName, email, phone);
////            contactlist.add(entry);
////            top++;
////            try {
////                entry.write();
////            } catch (Exception e) {
////            }
//
//        }
//
//    }
//
//    public void view() {
//        for (int index = 0; index < top; index++) {
//            contactlist.get(index).viewContact();
//        }
//    }
//}
//
