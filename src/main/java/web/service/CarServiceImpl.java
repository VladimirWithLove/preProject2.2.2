package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        Car car1 = new Car("BMW", 1, "Vladimir");
        Car car2 = new Car("Audi", 2, "Andrey");
        Car car3 = new Car("VW", 1, "Aleksey");
        Car car4 = new Car("MB", 3, "Michail");
        Car car5 = new Car("Volvo", 10, "Oleg");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }
    public List<Car> getCertainCarNumber(int number) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (number <= 0) {
                return result;
            }
            result.add(car);
            number--;
        }
        return result;
    }
}
