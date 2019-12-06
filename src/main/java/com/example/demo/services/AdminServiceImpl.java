package com.example.demo.services;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    public AdminRepository adminRepository;

    @Override
    public Admin loadAdmin(String Username, String password) {
        List<Admin> adminList = findAllAdminDetail();
        if(adminList == null || adminList.isEmpty()){
            throw new NullPointerException(Username);
        }else{
           return getAmin(Username,password,adminList);
        }
    }

    private Admin getAmin(String username,String password, List<Admin> AdminListToCheck) {
        for(Admin element : AdminListToCheck){
            if(element.getAdmin_username().equals(username) && element.getAdmin_password().equals(password)){
                return element;
            }
        }
        return null;
    }

    @Override
    public List<Admin> findAllAdminDetail() {
        return adminRepository.findAll();
    }
}
