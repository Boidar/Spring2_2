package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars;
    Car car1 = new Car("Mazda","CX-35", "Red");
    Car car2 = new Car("Nissan","Tiida", "Gold");
    Car car3 = new Car("Ford","Fusion", "Black");
    Car car4 = new Car("Toyota","Camry", "White");
    Car car5 = new Car("Audi","Q-8", "Gradient");
    {
        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> rut = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            rut.add(cars.get(i));
        }
        return rut;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
