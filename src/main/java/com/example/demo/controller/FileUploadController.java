package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {
    private final String uploadDirectory = System.getProperty("admin.dir")+"/uploads";

    @RequestMapping("/")
    public String uploadImage(Model model){
        return "uploadView";
    }
}
