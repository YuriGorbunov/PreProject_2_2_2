package web.service;

import web.models.Car;

import java.util.List;

public interface CarServiceInt {

    public List<Car> countCars(int limit);

    public List <Car> getAllCars ();
}
