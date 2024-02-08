package Model;

import java.util.Objects;

public class Car {
    private String model;
    private int year;
    private String mileage;

    public Car() {
    }

    public Car(String model, int year, String mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(mileage, car.mileage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
