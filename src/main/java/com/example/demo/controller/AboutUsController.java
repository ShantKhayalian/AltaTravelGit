package com.example.demo.controller;

import com.example.demo.services.AboutUsServiceImpl;
import org.bson.BsonBinarySubType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
    @Autowired
    private AboutUsServiceImpl aboutUsServiceImpl;


}
