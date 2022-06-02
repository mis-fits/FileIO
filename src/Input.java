import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
//        System.out.println("What did you eat for dinner? ");
        String userInput = scanner.nextLine();
//        System.out.println(userInput + " tastes like crap!");
        return userInput;
    }

    public String getString(String prompt) {
        System.out.println("What did you eat for dinner? ");
        String userInput = scanner.nextLine();
        System.out.println(userInput + " tastes like crap!");
        return userInput;
    }

    public boolean yesNo() {
//        System.out.println("Did you enjoy dinner last night? (yes/no) ");
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
//            System.out.println(true);
            System.out.println();
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    public int getInt() {
        System.out.print("Enter a number ");
        int input = 0;
        try {
            input = Integer.parseInt(getString());
        } catch (Exception e) {
            System.out.println("Invalid input.\n");
            getInt();
        }
        return input;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        int input = 0;
        try {
            input = Integer.parseInt(getString());
        } catch (Exception e) {
            System.out.println("Invalid input \n");
            getInt();
        }
        return input;
    }
//    public int getInt(){
//        System.out.println("Please enter a random number: ");
//
//        int getRandomIntInput = 0;
//
//        String userInput = scanner.next();
//
//        try {
//            getRandomIntInput = Integer.valueOf(userInput);
//
//        } catch (Exception e) {
//
//            getInt();
//
//        }
//
//        return getRandomIntInput;
//
//    }
//
//    public double getDouble(){
//
//        System.out.println("Please enter a random number with a floating point: ");
//
//        double getRandomDoubleInput = 0.0;
//
//
//        String userInput = scanner.next();
//
//        try {
//
//            getRandomDoubleInput = Double.valueOf(userInput);
//
//        }catch (Exception e){
//
//            getDouble();
//
//        }
//
//        return getRandomDoubleInput;

    }

//    public int getInt(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int num = scanner.nextInt();
//        if (num < 10 && num > 1){
//            return num;
//        }else return getInt();
//    }
//
//    public double getDouble(double min, double max){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        double num = scanner.nextDouble();
//        if (num < 10 && num > 1){
//            return num;
//        }else return getDouble(min, max);
//    }


