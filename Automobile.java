package final_Program;

public class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        try {
            make = "";
            model = "";
            color = "";
            year = 0;
            mileage = 0;
        } catch (Exception e) {
            System.out.println("Constructor error");
        }
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Constructor error");
        }
    }

    // Add a new vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Failed to add vehicle.";
        }
    }

    // List vehicle information
    public String[] listVehicleInfo() {
        try {
            return new String[] {
                "Make: " + make,
                "Model: " + model,
                "Color: " + color,
                "Year: " + year,
                "Mileage: " + mileage
            };
        } catch (Exception e) {
            return new String[] { "Error listing vehicle." };
        }
    }

    // Remove vehicle
    public String removeVehicle() {
        try {
            make = "";
            model = "";
            color = "";
            year = 0;
            mileage = 0;
            return "Vehicle removed.";
        } catch (Exception e) {
            return "Failed to remove vehicle.";
        }
    }

    // Update vehicle
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle.";
        }
    }
}
