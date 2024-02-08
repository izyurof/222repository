package web.controller;

import Model.Car;
import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarsController {
    private CarServiceImpl carService = new CarServiceImpl();

    @RequestMapping("/cars")
    public String carsTable(ModelMap model, @RequestParam(name="count", required = false, defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCarList(count));
        return "cars";
    }
}
