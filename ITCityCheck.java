import java.util.Scanner;

public class ITCityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = sc.nextLine().trim().toLowerCase();

        if (city.equals("delhi") || city.equals("mumbai") || city.equals("kolkata") ||
            city.equals("bangalore") || city.equals("chennai") || city.equals("hyderabad")) {
            System.out.println(city + " is an IT City.");
        } else {
            System.out.println(city + " is not an IT City.");
        }
    }
}
