package com.walter.controller;

import com.walter.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class AddController {
    @Autowired
    private AddService addService;

    public AddController() {
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "name") String name, @RequestParam(value = "phone") String phone) {
        String data = addService.add(name, phone);
        System.out.println(data);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("data", data);
        return modelAndView;
    }


}
