package com.example.demo.services;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    public AdminRepository adminRepository;

    @Override
    public Admin loadAdmin(String Username, String password) {
        List<Admin> adminList = findAllAdminDetail();
        if (adminList == null || adminList.isEmpty()) {
            throw new NullPointerException(Username);
        } else {
            return getAmin(Username, password, adminList);
        }
    }

    private Admin getAmin(String username, String password, List<Admin> AdminListToCheck) {
        for (Admin element : AdminListToCheck) {
            if (element.getAdmin_username().equals(username) && element.getAdmin_password().equals(password)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public List<Admin> findAllAdminDetail() {
        return adminRepository.findAll();
    }

    @Override
    public Optional<Admin> getAdminById(String id) {
        return adminRepository.findById(id);
    }

    @Override
    public void updateAdminPassword(String password, String id) {
        Admin admin = adminRepository.findAllById(id);
        String username = admin.getAdmin_username();
        admin = new Admin(id,username, password);
        adminRepository.save(admin);

    }

    @Override
    public Admin findById(String id) {
        return adminRepository.findAllById(id);
    }
}
