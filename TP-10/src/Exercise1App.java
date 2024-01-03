import java.sql.Date;
import java.util.Scanner;

public class Exercise1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Exercise1 vehicle = null;
        Exercise2 vehicleTypeManager = new Exercise2();

        do {
            System.out.println("Vehicle Management System");
            System.out.println("1. Add Vehicle");
            System.out.println("2. List Vehicles");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Remove Vehicle");
            System.out.println("-----Exercise 2-----");
            System.out.println("5. Add Vehicle Type");
            System.out.println("6. List Vehicle Types");
            System.out.println("7. Remove Vehicle Type");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter vehicle number: ");
                        String vehicleNumber = scanner.nextLine();
                        System.out.println("ID of vehicle type:");
                        vehicleTypeManager.listVehicleTypes();
                        System.out.print("Enter vehicle type: ");
                        String vehicleType = scanner.nextLine();
                        System.out.print("Enter year of creation: ");
                        int yearOfCreation = scanner.nextInt();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter date of availability (yyyy-mm-dd): ");
                        String dateStr = scanner.next();
                        Date dateOfAvailability = Date.valueOf(dateStr); // Assumes the date is entered in the format yyyy-mm-dd

                        vehicle = new Exercise1(vehicleNumber, vehicleType, yearOfCreation, price, dateOfAvailability);
                        vehicle.addVehicle();
                        System.out.println("Vehicle added successfully.");
                        break;
                    case 2:
                        if (vehicle != null) {
                            vehicle.listVehicles();
                        } else {
                            System.out.println("No vehicle records available.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter vehicle number to update: ");
                        vehicleNumber = scanner.nextLine();
                        if (vehicle != null && vehicle.getVehicleNumber().equals(vehicleNumber)) {
                            vehicle.updateVehicle(vehicleNumber);
                            System.out.println("Vehicle updated successfully.");
                        } else {
                            System.out.println("Vehicle number not found.");
                        }
                        break;
                    case 4:
                        System.out.print("Enter vehicle number to remove: ");
                        vehicleNumber = scanner.nextLine();
                        if (vehicle != null && vehicle.getVehicleNumber().equals(vehicleNumber)) {
                            vehicle.removeVehicle(vehicleNumber);
                            System.out.println("Vehicle removed successfully.");
                        } else {
                            System.out.println("Vehicle number not found.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter vehicle type name:");
                        String typeName = scanner.nextLine();
                        vehicleTypeManager.addVehicleType(new VehicleType(typeName));
                        System.out.println("Vehicle type added successfully.");
                        break;
                    case 6:
                        vehicleTypeManager.listVehicleTypes();
                        break;
                    case 7:
                        System.out.print("Enter vehicle type ID to remove: ");
                        int typeId = scanner.nextInt();
                        vehicleTypeManager.deleteVehicleType(typeId);
                        System.out.println("Vehicle type removed successfully.");
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            System.out.println(); // Print a blank line before next iteration
        } while (choice != 0);

        scanner.close();
    }
}
