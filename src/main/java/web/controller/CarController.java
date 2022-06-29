package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {


    @GetMapping("/cars")
    public String carList (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", "This is my list of cars");
        List <Car> list = new ArrayList<>();
        list.add(new Car("AUDI", "Black", 2010));
        list.add(new Car("BMW", "Red", 2015));
        list.add(new Car("Rower", "White", 2019));
        list.add(new Car("Chevrolet", "Yellow", 2008));
        list.add(new Car("Lambo", "Orange", 2012));
        list = CarService.carsCount(list, count);
        model.addAttribute("list", list);
        return "cars";
    }
}
