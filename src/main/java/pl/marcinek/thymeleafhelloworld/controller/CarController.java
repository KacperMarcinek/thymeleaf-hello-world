package pl.marcinek.thymeleafhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.marcinek.thymeleafhelloworld.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    //define a list of cars
    private List<Car> cars;

    public CarController() {

        //sample data
        Car mazda = new Car("Mazda", "CX-5");
        Car honda = new Car("Honda","CR-V");
        Car toyota = new Car("Toyota", "Rav4");

        //instantiate the list as an ArrayList
        cars = new ArrayList<>();

        //add cars to the list
        cars.add(mazda);
        cars.add(honda);
        cars.add(toyota);

    }

    @GetMapping("/car")
    public String getCar(Model model){

        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());

        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car){

        //add the new car to the list
        cars.add(car);

        return "redirect:/car";
    }
}
