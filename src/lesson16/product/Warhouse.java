package lesson16.product;

public class Warhouse {
    Phone iPhone14 = new Phone("iPhone14", 7589, 35000, "Phone", "iOS");
    Phone iPhone13 = new Phone("iPhone13", 7579, 30000, "Phone", "iOS");
    Phone Samsung = new Phone("Samsung X5", 7539, 35000, "Phone", "Android");
    Playstation PS5 = new Playstation("PS5", 5698, 40000, "Playstation");
    Playstation PS4 = new Playstation("PS4", 5690, 25000, "Playstation");


    public String printAccountInfoiPhone14() {
        return iPhone14.toString();
    }

    public String printAccountInfoiPhone13() {

        return iPhone13.toString();
    }

    public String printAccountInfoSamsung() {
        return Samsung.toString();
    }

    public String printAccountInfoPS5() {
        return PS5.toString();
    }

    public String printAccountInfoPS4() {
        return PS4.toString();
    }


}










