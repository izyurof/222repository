package web.controller;

import Service.CarServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan("Service")
public class CarsController {
    private final CarServiceImpl carService;
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String carsTable(ModelMap model, @RequestParam(name="count", required = false, defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCarList(count));
        return "cars";
    }
}
