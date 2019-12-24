package com.example.demo.controller;

import com.example.demo.repository.AboutUsRepository;
import com.example.demo.services.AboutUsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutUsController {
    @Autowired
    private AboutUsServiceImpl aboutUsServiceImpl;
    private AboutUsRepository aboutUsRepository;



    @RequestMapping(value = "/admin/UpdateAboutUs", method = RequestMethod.GET)
    public String AboutUs(Model model){
        model.addAttribute("aboutUsAll",aboutUsServiceImpl.showAll());
        return "/admin/UpdateAboutUs";
    }



}
