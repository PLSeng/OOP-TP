package Vehicle;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private int yearOfManufacture;
    private double price;
    private String dateOfEntry;

    private static String DB_URL = "jdbc:mysql://localhost:3306/vehicle_tp_10";
    private static String DB_USER = "root";
    private static String DB_PASS = "Lim078927401";

    public Vehicle(String vehicleNumber, String vehicleType, int yearOfManufacture, double price, String dateOfEntry) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.dateOfEntry = dateOfEntry;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }
}
