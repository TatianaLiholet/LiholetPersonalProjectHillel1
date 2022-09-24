package lesson16.checkout;

import java.util.Scanner;

public class Payment {

    public static void paymentByMethodMasrercard() {
        PaymentMethod method = PaymentMethod.MASTERCARD;
        System.out.println(method);
        System.out.println("Enter your card number");
        Scanner scanner = new Scanner(System.in);
        String cardNumber = scanner.nextLine();
        System.out.println("Enter the expiring data format DD MM");
        String dataExpiren = scanner.nextLine();
        System.out.println("Enter your card CVV");
        String cvv = scanner.nextLine();
        System.out.println("Payment finish completly!");

    }

    public static void paymentByMethodforVisa() {
        PaymentMethod method1 = PaymentMethod.VISA;
        System.out.println(method1);
        System.out.println("Enter your card number");
        Scanner scanner = new Scanner(System.in);
        String cardNumber = scanner.nextLine();
        System.out.println("Enter the expiring data format DD MM");
        String dataExpiren = scanner.nextLine();
        System.out.println("Enter your card CVV");
        String cvv = scanner.nextLine();
        System.out.println("Payment finish completly!");
    }

}
