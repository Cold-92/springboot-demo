package org.donkeefer.controller;

import org.donkeefer.bean.Vegetables;
import org.donkeefer.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VegetablesController {

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    @ResponseBody
    public Vegetables vegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenPepper(vegetablesConfig.getGreenPepper());
        return vegetables;
    }

}
