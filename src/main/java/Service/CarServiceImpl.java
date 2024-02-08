package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarServiceImpl implements CarService {
    private final List<Car> CARS =
            new ArrayList<>(List.of(
                    new Car("Hyundai Solaris", 2017, "105000 km"),
                    new Car("Toyota Highlander", 2019, "53000 km"),
                    new Car("Toyota RAV4", 2019, "19100 km"),
                    new Car("Chevrolet Lacetti", 2011, "157000 km"),
                    new Car("Renault Duster", 2020, "89000 km")));

    @Override
    public List<Car> getCarList(int count) {
        List<Car> car = new ArrayList<>();
        if (count >= 5) {
            return CARS;
        }
        for (int i = 0; i <= count - 1; i++) {
            car.add(CARS.get(i));
        }
        return car;
    }
}
