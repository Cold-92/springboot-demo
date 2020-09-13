package org.cold92.controller;

import org.cold92.bean.Guest;
import org.cold92.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/toAdd")
    public String toAdd() {
        return "/thymeleaf/add.html";
    }

    @PostMapping
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest";
    }

    @RequestMapping("/toUpdate/{name}")
    public String toUpdate(Model model, @PathVariable("name") String name) {
        Guest guest = guestService.findGuestByName(name);
        model.addAttribute("guest", guest);
        return "/thymeleaf/update.html";
    }

    @PutMapping
    public String update(Guest guest) throws Exception {
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name) throws Exception {
        guestService.delete(name);
        return "redirect:/guest";
    }


}
