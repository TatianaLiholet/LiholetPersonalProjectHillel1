package lesson16.customer;

import java.util.Scanner;

public class LoginForm extends CustomerDataBase {
    public static void logInUser() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println("Hi, enter your email:");

        customerListForexistin.add(String.valueOf(customer1.getEmail()));
        customerListForexistin.add(String.valueOf(customer2.getEmail()));
        customerListForexistin.add(String.valueOf(customer3.getEmail()));
        customerListForexistin.add(String.valueOf(customer1.getPassword()));
        customerListForexistin.add(String.valueOf(customer2.getPassword()));
        customerListForexistin.add(String.valueOf(customer3.getPassword()));

        if (customerListForexistin.contains(scanner.nextLine())) {
            System.out.println("Enter your password:");
            if (customerListForexistin.contains(scanner.nextLine())) {
                System.out.println("You are log in. What do you want to buy?");
            } else System.err.println("The password is wrong, please try again");
        } else {
            System.out.println("Seems your email, doesn't represent in our system. Do you want to register? " +
                    "Yes or No");
            answer = scanner.nextLine();
            if (answer.equals("Yes")) {
                RegistrationForm.regUser();

            } else if (answer.equals("No")) {
                System.out.println("Ok, we are sorry to hear that ");
                System.exit(0);

            } else {
                System.err.println("We don't understand you");
                System.exit(0);
            }
        }

    }
}

