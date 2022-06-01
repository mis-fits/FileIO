

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
        Input entry = new Input();
        System.out.print("Enter new contact Full Name and Phone Number: ");
        String name = entry.getString();
        new ContactManager();
        try {
            List<String> currentContacts = Files.readAllLines(filepath);
            // Loop through contacts
            for (String contact : currentContacts) {
                System.out.println(currentContacts);
                System.out.println("before: "+contact);
                System.out.println("before: "+name);
                // checking if name matches user input
                if (contact.equalsIgnoreCase(name)) {
                    System.out.println(contact);
                    System.out.println(name);
//                    System.out.println("added: " + name);
                    System.out.println();
                    new ContactManager();
                    System.out.println("A contact with that name already exists.\n" +
                            "Would you like to continue?");
                } else {
                    try {
                        Files.write(filepath, Arrays.asList(name),StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        System.out.println("Error name not added!");;
                    }

                    if (!entry.yesNo()) {
                        ContactManager.recommence();
                    }

                }
            }

        } catch (IOException e) {
            System.err.println("ERROR");
            ContactManager.recommence();
        }



    }
}