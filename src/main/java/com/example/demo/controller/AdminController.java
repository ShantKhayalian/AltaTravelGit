package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.services.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {


    private AdminServiceImpl adminServiceimpl;
    private AdminRepository adminRepository;

    public AdminController(AdminServiceImpl adminServiceimpl, AdminRepository adminRepository) {
        this.adminServiceimpl = adminServiceimpl;
        this.adminRepository = adminRepository;
    }

    @Autowired
    public AdminController(AdminServiceImpl adminServiceimpl) {
        this.adminServiceimpl = adminServiceimpl;
    }


    @RequestMapping("/admin")
    public String getAboutUs() {
        return "admin/SignIn";
    }

    @PostMapping(value = "/admin/Login")
    public String loginCheck(@RequestParam String username, @RequestParam String Password, Model model, HttpSession session) {
        Admin admin = adminServiceimpl.loadAdmin(username, Password);
        if (admin != null) {
            String sessionNameTracker = admin.getAdmin_username();
            session.setAttribute("NameInSession", sessionNameTracker);
            //model.addAttribute("adminInfo", admin);
        } else {
            model.addAttribute("message", "Օգտագործողի անունը կամ գաղտնաբառը սխալ է");
            return "admin/login/Login";
        }
        return "admin/index";
    }
}
