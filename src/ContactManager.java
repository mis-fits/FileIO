
import java.io.IOException;
import java.nio.file.Files;

public class ContactManager {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Find a contact.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit");
        System.out.println("Enter an option (1, 2, 3, 4 or 5)");
        System.out.println("-----------------");

        userInput();
    }

    public static void userInput() throws IOException {
        Input selection = new Input();
        int input = selection.getInt();
        switch (input) {
            case 1:
                ContactList.displayAllContacts();
            case 2:
                ContactList.addContact();
            case 3:
                ContactList.findContact();
            case 4:
                ContactList.deleteContact();
            case 5:
                ContactList.exitContactMgr();
        }
    }

    public static void recommence() throws IOException {
        System.out.println("Would you like to continue? ");
        Input choice = new Input();
        if (choice.yesNo()) {
            menu();
        } else {
            System.out.println("Process Ended");
            System.exit(0);
        }
    }
}

