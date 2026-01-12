package final_Program;

import java.io.FileWriter;
import java.util.Scanner;

public class Dealership_Inventory {

    public static void main(String[] args) {

        try {
            // Create automobile using parameterized constructor
            Automobile auto = new Automobile("Toyota", "Camry", "Silver", 2018, 60000);

            // List vehicle information
            System.out.println("Vehicle Information:");
            String[] info = auto.listVehicleInfo();
            for (String item : info) {
                System.out.println(item);
            }

            // Remove vehicle
            System.out.println("\n" + auto.removeVehicle());

            // Add new vehicle
            System.out.println(auto.addVehicle("Honda", "Civic", "Blue", 2020, 30000));

            // List new vehicle information
            System.out.println("\nNew Vehicle Information:");
            info = auto.listVehicleInfo();
            for (String item : info) {
                System.out.println(item);
            }

            // Update vehicle
            System.out.println(auto.updateVehicle("Honda", "Civic", "Black", 2020, 35000));

            // List updated vehicle information
            System.out.println("\nUpdated Vehicle Information:");
            info = auto.listVehicleInfo();
            for (String item : info) {
                System.out.println(item);
            }

            // Ask user if they want to print to a file
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nPrint vehicle info to file? (Y/N): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("Y")) {

                FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt");
                for (String item : info) {
                    writer.write(item + "\n");
                }
                writer.close();

                System.out.println("File printed to C:\\Temp\\Autos.txt");

            } else {
                System.out.println("File will not be printed.");
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Program error: " + e.getMessage());
        }
    }
}
