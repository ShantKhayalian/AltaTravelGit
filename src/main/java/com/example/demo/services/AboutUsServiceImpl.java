package com.example.demo.services;

import com.example.demo.model.AboutUs;
import com.example.demo.repository.AboutUsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutUsServiceImpl implements AboutUsService {
    AboutUsRepository aboutUsRepository;

    public AboutUsServiceImpl(AboutUsRepository aboutUsRepository) {
        this.aboutUsRepository = aboutUsRepository;
    }


    @Override
    public List<AboutUs> showAll() {
        return aboutUsRepository.findAll();
    }
}
