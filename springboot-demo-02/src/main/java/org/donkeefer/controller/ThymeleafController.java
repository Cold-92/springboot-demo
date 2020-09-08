package org.donkeefer.controller;

import org.donkeefer.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    /**
     * Thymeleaf整合
     * @return
     */
    @RequestMapping("/thymeleaf")
    public String toIndex(Model model) {
        model.addAttribute("name", "john");
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("john");
        restaurant.setChef("mayer");
        model.addAttribute("restaurant", restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String toWelcome(Model model) {
        return "thymeleaf/welcome";
    }

}
