package lesson16.customer;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class CustomerDataBase {
    static Customer customer1 = new Customer("Tanya", "Liholet", "liholet.ta@gmail.com",
            "0986010514", "Password1!");

    static Customer customer2 = new Customer("Max", "Brati", "brat1@gmail.com",
            "0986010514", "Password2!");

    static Customer customer3 = new Customer("Ivan", "Mithrh", "mIth@gmail.com",
            "0986015896", "Password3!");

    static ArrayList<String> customerListForexistin = new ArrayList<>();


}
