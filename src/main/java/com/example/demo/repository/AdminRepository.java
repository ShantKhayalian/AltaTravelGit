package com.example.demo.repository;

import com.example.demo.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

public interface AdminRepository extends MongoRepository<Admin,String> {


    Admin findAllById(String id);
}
