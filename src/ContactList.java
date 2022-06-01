

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ContactList extends ContactManager {
    public static Path filepath = Paths.get("src", "contacts.txt");


    public static void displayAllContacts() throws IOException {
        List<String> contacts = Files.readAllLines(filepath);
        System.out.println(contacts);

    }

    public static void addContact() throws IOException {
        boolean matches = true;
        Input entry = new Input();
        System.out.print("Enter new contact Full Name and Phone Number: ");
        String name = entry.getString();
//        new ContactManager();
//        try {
            List<String> currentContacts = Files.readAllLines(filepath);
            // Loop through contacts
            for (String contact : currentContacts) {
                // checking if name matches user input
                if (contact.equalsIgnoreCase(name)) {
                    System.out.println("A contact with that name already exists.\n" +
                            "Would you like to continue?");
                    System.out.println();

                } else {
                    matches = false;
                }
            } //end for loop

            if(!matches) {
                System.out.println("Name was not found and will now add it.");
                try {
                    Files.write(filepath, Arrays.asList(name), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    System.out.println("Error name not added!");
                }
            }
//        } catch (IOException e) {
//            System.err.println("ERROR");
//            ContactManager.recommence();
//        }

        System.out.println();
        menu();


    } // end addContact Method

    public static void deleteContact() throws IOException {
        Input entry = new Input();
        System.out.print("Enter new contact Full Name and Phone Number: ");
        String name = entry.getString();
        List<String> currentContacts = Files.readAllLines(filepath);
        // Loop through contacts
        System.out.println("before delete: " + currentContacts);

        for (String contact : currentContacts) {
            // checking if name matches user input
            if (contact.equalsIgnoreCase(name)) {
                System.out.println("Found the name. Deleting it now.");
//                try {
                    currentContacts.remove(contact);
                    Files.write(filepath, currentContacts);
//                } catch (Exception e) {
//                    System.out.println("something's wrong, exception error.");
//                }
            } else {
                System.out.println("Did not find the name you were looking for.");
            }
        } //end for loop
        System.out.println("after delete: " + currentContacts);

        System.out.println();
        menu();


    } //end deleteContact Method
}