package org.cold92.controller;

import org.cold92.bean.Guest;
import org.cold92.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String list(Model model) {
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList", guestList);
        return "/thymeleaf/list.html";
    }

//    @RequestMapping("/guest/toAdd")
//    public String toAdd() {
//        return "/thymeleaf/add.html";
//    }
//
//    @RequestMapping("/guest/add")
//    public String add(Guest guest) {
//        guestService.add(guest);
//        return "redirect:/guest/list";
//    }
//
//    @RequestMapping("/guest/toUpdate")
//    public String toUpdate(Model model, String name) {
//        model.addAttribute("name", name);
//        return "/thymeleaf/update.html";
//    }
//
//    @RequestMapping("/guest/update")
//    public String update(Guest guest) throws Exception {
//        guestService.update(guest);
//        return "redirect:/guest/list";
//    }
//
//    @RequestMapping("/guest/delete")
//    public String delete(String name) throws Exception {
//        guestService.delete(name);
//        return "redirect:/guest/list";
//    }


}
