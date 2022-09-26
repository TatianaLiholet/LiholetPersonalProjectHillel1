package lesson16.customer;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationForm {

    public static void regUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Enter your surname");
        String surname = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your telephone number");
        String telephoneNumber = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();

        Customer customer = new Customer(name, surname, email, telephoneNumber, password);
        ArrayList<String> customerNew = new ArrayList<>();
        customerNew.add(String.valueOf(customer));

        System.out.println("Here you profile, you can start buy something");

    }
}
