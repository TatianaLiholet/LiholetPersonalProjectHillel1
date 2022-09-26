package lesson16;

import lesson16.checkout.DayOfWeak;
import lesson16.checkout.Payment;
import lesson16.checkout.SelectingDayOfTheWeek;
import lesson16.checkout.SelectingProduct;
import lesson16.customer.LoginForm;
import lesson16.invoice.InfoInvoice;
import lesson16.product.Warhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginForm.logInUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you wan't to see all our catalog of products? " +
                "Yes or No");
        String answer = scanner.nextLine();
        Warhouse warhouse = new Warhouse();
        if (answer.equals("Yes")) {
            System.out.println(warhouse.printAccountInfoiPhone13());
            System.out.println(warhouse.printAccountInfoiPhone14());
            System.out.println(warhouse.printAccountInfoSamsung());
            System.out.println(warhouse.printAccountInfoPS5());
            System.out.println(warhouse.printAccountInfoPS4());
        } else if (answer.equals("No")) {
            System.out.println("Ok, we are sorry to hear that ");
            System.exit(0);
        } else {
            System.err.println("We don't understand you");
        }
        System.out.println("Enter the name of product that you want to buy");
        SelectingProduct.selectProduct();

        System.out.println("Enter the name of day in which you want to recive your order");
        String dayOfTheWeek = scanner.nextLine();
        SelectingDayOfTheWeek.selectDay(DayOfWeak.valueOf(dayOfTheWeek));

        System.out.println("How do you want to pay with  'VISA' or 'MASTERCARD'");
        String answerPayment = scanner.nextLine();
        if (answerPayment.equals("VISA")) {
            Payment.paymentByMethodforVisa();
        } else if (answerPayment.equals("MASTERCARD")) {
            Payment.paymentByMethodMasrercard();
        } else {
            System.err.println("We don't understand you");
        }

        InfoInvoice.takeInfo();
    }
}

