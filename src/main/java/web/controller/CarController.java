package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
//    @GetMapping()
//    public String index(ModelMap model) {
//        model.addAttribute("cars", carService.index());
//
//        return "cars/index";
//    }

    @GetMapping()
    public String getCars(@RequestParam(name = "count") int count, ModelMap model) {
        model.addAttribute("cars", carService.index(count));
        return "cars/show";
    }

}
