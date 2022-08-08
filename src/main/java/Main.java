import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        FConversionService conversion = new FConversionService(); //dependency injection
        SimpleConversionService simple = new SimpleConversionService(); //dependency injection
        ConversionService conversionService = new ConversionService(conversion);
        ConversionService conversionService1 = new ConversionService(simple);

        while (true) {

            System.out.println("press 1 to convert to USD, press anyInt to convert to Foreign");

            while (!input.hasNextInt()) {
                input.nextLine();
            }

            if (input.nextInt() == 1) {
                int scan = input.nextInt();

                Coins c = new Coins(scan);

                conversionService1.convert(c);

            } else {
                int scan = input.nextInt();

                Coins c = new Coins(scan);

                conversionService.convert(c);

            }
        }
    }
}
