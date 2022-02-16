import java.util.Scanner;

public class ConsoleBankAccount {
    //Class Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;
    String customerPin;

    //Class constructor
    ConsoleBankAccount(String cname, String cid, String pin) {
        customerName = cname;
        customerID = cid;
        customerPin = pin;
    }

    //Function for Depositing money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //Function for Withdrawing money
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Function showing the previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    //Function calculating interest of current funds after a number of years
    void calculateInterest(int years) {
        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, you balance will be: " + newBalance);
    }

    //Function showing the main menu
    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "████████╗ ██████╗███████╗ ██████╗    ██████╗  █████╗ ███╗   ██╗██╗  ██╗\n" +
                "╚══██╔══╝██╔════╝██╔════╝██╔════╝    ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝\n" +
                "   ██║   ██║     ███████╗██║         ██████╔╝███████║██╔██╗ ██║█████╔╝ \n" +
                "   ██║   ██║     ╚════██║██║         ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗ \n" +
                "   ██║   ╚██████╗███████║╚██████╗    ██████╔╝██║  ██║██║ ╚████║██║  ██╗\n" +
                "   ╚═╝    ╚═════╝╚══════╝ ╚═════╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝\n" +
                "                                                                       \n");
        System.out.println(ConsoleColors.BLUE_BACKGROUND+ ConsoleColors.BLACK_BOLD + " \t Welcome, " + customerName + "!");
        System.out.println("\t Your ID is: " + customerID);
        System.out.println();
        System.out.println("\t What would you like to do?");
        System.out.println();
        System.out.println("\t A. Check your balance");
        System.out.println("\t B. Make a deposit");
        System.out.println("\t C. Make a withdrawal");
        System.out.println("\t D. View previous transaction");
        System.out.println("\t E. Calculate interest");
        System.out.println("\t F. Exit");

        do {
            System.out.println();
            System.out.println("\t Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option) {
                //Case 'A' allows the user to check their account balance
                case 'A':
                    System.out.println("====================================");
                    System.out.println("\t \t Balance = $" + balance);
                    System.out.println("====================================");
                    System.out.println();
                    break;
                //Case 'B' allows the user to deposit money into their account using the 'deposit' function
                case 'B':
                    System.out.println("\t \t \t Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                //Case 'C' allows the user to withdraw money from their account using the 'withdraw' function
                case 'C':
                    System.out.println("\t \t \t Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                //Case 'D' allows the user to view their most recent transaction using the 'getPreviousTransaction' function
                case 'D':
                    System.out.println("====================================");
                    getPreviousTransaction();
                    System.out.println("====================================");
                    System.out.println();
                    break;
                //Case 'E' calculates the accrued interest on the account after a number of years specified by the user
                case 'E':
                    System.out.println("\t \t \t Enter how many years of accrued interest: ");
                    int years = scanner.nextInt();
                    calculateInterest(years);
                    break;
                //Case 'F' exits the user from their account
                case 'F':
                    System.out.println("====================================");
                    break;
                //The default case let's the user know that they entered an invalid character and how to enter a valid one
                default:
                    System.out.println(ConsoleColors.RED_BACKGROUND+ ConsoleColors.WHITE_BOLD+ "Error: invalid option. Please enter A, B, C, D, or E or access services.");
                    break;
            }
        } while(option != 'F');
        System.out.println("Thank you for banking with us!");
    }

}