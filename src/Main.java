import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        char option = '\0';

        System.out.println("\n" +
                "████████╗ ██████╗███████╗ ██████╗    ██████╗  █████╗ ███╗   ██╗██╗  ██╗\n" +
                "╚══██╔══╝██╔════╝██╔════╝██╔════╝    ██╔══██╗██╔══██╗████╗  ██║██║ ██╔╝\n" +
                "   ██║   ██║     ███████╗██║         ██████╔╝███████║██╔██╗ ██║█████╔╝ \n" +
                "   ██║   ██║     ╚════██║██║         ██╔══██╗██╔══██║██║╚██╗██║██╔═██╗ \n" +
                "   ██║   ╚██████╗███████║╚██████╗    ██████╔╝██║  ██║██║ ╚████║██║  ██╗\n" +
                "   ╚═╝    ╚═════╝╚══════╝ ╚═════╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝\n" +
                "                                                                       \n");
        System.out.println(ConsoleColors.BLUE_BACKGROUND+ "\n");
        System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT + " \t WELCOME  !");
        System.out.println("\t What would you like to do ");
        System.out.println("\n\t \t A. CREATE ACCOUNT. ");
        System.out.println("\t \t B. LOGIN ");
        System.out.println("\n \n");

        do {
            System.out.println();
            System.out.println(ConsoleColors.BLUE_BACKGROUND+ ConsoleColors.WHITE_BOLD_BRIGHT + "\t Enter an option: \n");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option) {
                // A. CREATE Account.
                case 'A':
                    System.out.println("===a=================================");
                    createAccount();
                    option = 'Q';
                    break;
                // B. Login.
                case 'B':
                    System.out.println("===LOGIN=================================");
                    ConsoleBankAccount tempUser = new ConsoleBankAccount("USER", "B00002", "1234");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    tempUser.showMenu();

                    break;

                case 'Q':
                    System.out.println("==================THANK=YOU=================");
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BACKGROUND+ ConsoleColors.WHITE_BOLD_BRIGHT+ "ERROR! Invalid option Entered Please enter A, B or Q to access services.");
                    break;
            }
        } while(option != 'Q');




//        ConsoleBankAccount tim = new ConsoleBankAccount("Tim Statler", "A00001");


//        ConsoleBankAccount beyonce = new ConsoleBankAccount("Beyonce", "B00002");
//        beyonce.showMenu();


    }

    private static void createAccount() {
        char option = '\0';
        String name;
        String pin;

        System.out.println();
        System.out.println(ConsoleColors.BLUE_BACKGROUND+ ConsoleColors.WHITE_BOLD_BRIGHT + "\t Enter YOUR NAME : \n");
        name = String.valueOf(scanner.next());

        System.out.println(ConsoleColors.BLUE_BACKGROUND+ ConsoleColors.WHITE_BOLD_BRIGHT + "\t Enter YOUR PIN: \n");
        pin = String.valueOf(scanner.next());




    }

}
