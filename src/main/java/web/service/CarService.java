package web.service;

import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carsCount(List<Car> list, int limit) {
        if (limit == 0 || limit == 5) {
            return list;
        }
        return list.stream().limit(limit).collect(Collectors.toList());
    }
}
