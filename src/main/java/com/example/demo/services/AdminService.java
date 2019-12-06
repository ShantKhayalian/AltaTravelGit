package com.example.demo.services;

import com.example.demo.model.Admin;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdminService {
    Admin loadAdmin(String Username, String password);
    List<Admin> findAllAdminDetail();

}
