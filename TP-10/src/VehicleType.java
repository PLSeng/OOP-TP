public class VehicleType {
    private int id; // Auto-incremented in the database
    private String name;

    // Constructor, assume name is validated externally
    public VehicleType(String name) {
        this.name = name;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}