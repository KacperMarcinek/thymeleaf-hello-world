package pl.marcinek.thymeleafhelloworld.model;

public class Car {

    private String model;
    private String make;

    public Car() {
    }

    public Car(String make, String model) {
        this.model = model;
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
