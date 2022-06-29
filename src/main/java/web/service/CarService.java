package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService implements CarServiceInt {

    private List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        carList.add(new Car("AUDI", "Black", 2005));
        carList.add(new Car("BMW", "Orange", 2013));
        carList.add(new Car("Rower", "White", 2015));
        carList.add(new Car("Chevrolet", "Yellow", 2022));
        carList.add(new Car("Lambo", "Red", 2012));
        return carList;
    }
    @Override
    public List<Car> countCars(int limit) {
        carList = getAllCars();
        if (limit == 0 || limit > 5) {
            return carList;
        }
        if (limit < 0) {
            return null;
        }
            return carList.stream().limit(limit).collect(Collectors.toList());
    }


}
