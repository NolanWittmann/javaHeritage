public abstract class Vehicle {

    // attributes
    private String brand;
    private int kilometers;

    // constructor
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // getters and setters
    public String getBrand() {
        return this.brand;
    }

    public void setName(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // methods
    public abstract String doStuff();

}