


import java.io.IOException;

public class ContactManager {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Delete an existing contact.");
        System.out.println("4. Exit.");
        System.out.println("Enter an option (1, 2, 3, 4 or 5)");

        userInput();
    }

    public static void userInput() throws IOException {
        Input selection = new Input();
        int input = selection.getInt();
        switch (input) {
            case 1:
                ContactList.displayAllContacts();
//            case 2:
//                addNewContact();
//            case 3:
//                deleteContact();
//            case 4:
//                findContact();
            case 5:
                System.out.println("GoodBye!");
                return;

        }
    }
}
//        }
//    }
//}
