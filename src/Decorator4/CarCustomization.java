package Decorator4;

import java.util.Scanner;

public class CarCustomization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new BasicCar();

        System.out.println("Welcome to the Car Customization System!");
        System.out.println("Choose features to add to your car:");
        System.out.println("1. Sunroof");
        System.out.println("2. Sports Rims");
        System.out.println("3. Leather Seats");
        System.out.println("4. Finish Customization");

        boolean customizing = true;
        while (customizing) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    car = new SunroofDecorator(car);
                    System.out.println("Sunroof added.");
                    break;
                case 2:
                    car = new SportsRimsDecorator(car);
                    System.out.println("Sports Rims added.");
                    break;
                case 3:
                    car = new LeatherSeatsDecorator(car);
                    System.out.println("Leather Seats added.");
                    break;
                case 4:
                    customizing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Your customized car: " + car.assemble());
        scanner.close();
    }
}
