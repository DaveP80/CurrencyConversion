import java.util.InputMismatchException;
import java.util.Scanner;

import static sun.misc.PostVMInitHook.run;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        while (true) {


            FConversionService conversion = new FConversionService(); //dependency injection
            SimpleConversionService simple = new SimpleConversionService(); //dependency injection
            ConversionService conversionService = new ConversionService(conversion);
            ConversionService conversionService1 = new ConversionService(simple);

            try {

                int choice;

                do {
                    System.out.println("Currency Conversion menu\n");
                    System.out.print("1.) Convert to USD \n");
                    System.out.print("2.) Convert to Foreign\n");
                    System.out.print("3.) Exit\n");
                    System.out.print("\nEnter Your Menu Choice: ");

                    while (!input.hasNextInt()) {
                        input.nextLine();
                    }
                    choice = input.nextInt();

                    switch (choice) {

                        case 1: {
                            System.out.print("USD->USD ");
                            int scan = input.nextInt();

                            Coins c = new Coins(scan);

                            conversionService1.convert(c);

                            break;
                        } //need brackets to contain Coin object

                        case 2:

                            System.out.print("USD->foreign ");
                            int scan = input.nextInt();

                            Coins c = new Coins(scan);

                            conversionService.convert(c);
                            Thread.sleep(2000);
                            break;

                        case 3:
                            System.out.println("Exiting Program...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

                    }

                } while (choice != 3);
            } catch (InputMismatchException e) {
                System.out.println("enter integers");

            }
        }
    }
}
