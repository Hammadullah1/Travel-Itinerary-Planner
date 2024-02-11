import java.util.Scanner;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.println("Please enter the number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine();
        String[] destinations = new String[numDestinations];
        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Enter destination " + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
        }

        System.out.println("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.println("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        System.out.println("Enter your budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter your accommodation preference (hotel, hostel, Airbnb, etc.): ");
        String accommodationPreference = scanner.nextLine();

        System.out.println("Generating your travel plan...");


        System.out.println("Here's your travel plan:");
        System.out.println("Destinations:");
        for (String destination : destinations) {
            System.out.println("- " + destination);
        }
        System.out.println("Dates: " + startDate + " to " + endDate);
        System.out.println("Budget: $" + budget);
        System.out.println("Accommodation preference: " + accommodationPreference);


    }
}
