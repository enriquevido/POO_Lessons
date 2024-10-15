public class Vehicle {
    private int id;
    private String brand;
    private String model;
    private String color;

    Vehicle(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Car extends Vehicle {
    Car(int id, String brand, String model, String color) {
        super(id, brand, model, color);
    }
}
