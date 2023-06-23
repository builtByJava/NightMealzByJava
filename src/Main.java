import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello and welcome to NightMealz By Dan!");

            System.out.println("------------------------------");
            System.out.println("1 - View Menu");
            System.out.println("2 - Place Order");
            System.out.println("3 - Cancel Order");
            System.out.println("4 - Leave a review");
            System.out.println("5 - Exit");

            //Menu logic
            System.out.println("Please select an option below");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            scan.nextLine(); //throw away to avoid nextLine trap

            //Depending on user selection, specific menu options will start processes
            switch (userInput) {
                case 1:
                    System.out.println("Here is our menu...");
                    //show full menu with food names and individual prices
                    OrderServices os = new OrderServices();
//                    os.showFullMenu();
                    break;

                case 2:

                    break;
                case 3:
                        System.out.println("Canceling your order...");
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Sorry! That is not one of the listed options...");
                    break;
            }

        }
    }
}
