package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, ModelMap model) {
        try {
            int number = Integer.parseInt(request.getParameter("count"));
            model.addAttribute("cars", carService.getCertainCarNumber(number));
        } catch (NumberFormatException ex) {
            model.addAttribute("cars", carService.getCertainCarNumber(5));
        }
        return "cars";
    }
}
