package lesson16.checkout;

import lesson16.product.Warhouse;

import java.util.Scanner;

public class SelectingProduct extends Warhouse {

    public static void selectProduct() {
        Scanner scanner = new Scanner(System.in);
        String nameOfProduct = scanner.nextLine();
        switch (nameOfProduct) {
            case "iPhone14":
                System.out.println("You select  the iPhone14 price is " + " 35000 UA");
                break;
            case "iPhone13":
                System.out.println("You select  the iPhone13 price is" + " 30000 UA ");
                break;
            case "Samsung X5":
                System.out.println("You select  the Samsung price is   " + " 35000 UA");
                break;
            case "PS5":
                System.out.println("You select  the PS5 price is  " + " 40000 UA");
                break;
            case "PS4":
                System.out.println("You select  the PS4 price is " + " 25000 UA");
            default:
                throw new IllegalArgumentException("Invalid name of product" + nameOfProduct);
        }
    }
}
