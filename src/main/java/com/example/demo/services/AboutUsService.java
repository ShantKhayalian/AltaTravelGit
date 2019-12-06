package com.example.demo.services;

import com.example.demo.model.AboutUs;

import javax.validation.OverridesAttribute;
import java.util.List;

public interface AboutUsService {
    List<AboutUs> showAll();
}
