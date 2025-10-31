// Answer for question 3. a
public abstract class Vehicle3a {
    // i)
    private String make;
    private String model;
    private String fuelType;
    private int year;
    private double mileage;

    // ii)
    Vehicle(String make, String model, String fuelType, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    // iii)
    public void update(String newModel, int newYear) {
        model = newModel;
        year = newYear;
    }
    public abstract void displayFeatures();
}
