package com.example.demo.services;

import com.example.demo.model.Admin;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AdminService {
    Admin loadAdmin(String Username, String password);
    List<Admin> findAllAdminDetail();
    Optional<Admin> getAdminById(String id);
    void updateAdminPassword(String password, String id);
    Admin findById(String id);
   /* Admin findByFirstName(String firstName);*/
  /*  List<Admin> findByLastName(String lastName);
    List<Admin> showAll();
    Optional<Admin> findById(String id);
    boolean isAdminExsists(String firstName, String lastName);
    boolean isSessionAdmin(HttpSession session);*/

}
