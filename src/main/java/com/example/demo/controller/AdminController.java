package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.services.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

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

    @RequestMapping("/admin/fullDetail")
    public String showAdmin(Model model) {
        model.addAttribute("FullAdminDetail", adminServiceimpl.findAllAdminDetail());
        return "/admin/fullDetail";
    }

    @RequestMapping(value = "/admin/ChangePassword")
    public String changePass(@RequestParam String id, @RequestParam String sessionAdmin, Model model,HttpSession session) {
        Optional<Admin> admin = adminServiceimpl.getAdminById(id);

        if (admin != null && session.getAttribute("NameInSession").equals(sessionAdmin)) {
            model.addAttribute("adminFullList", admin);
            return "admin/ChangePassword";
        } else {
            session.invalidate();
            model.addAttribute("message", "Անվտանգության ազդանշան,\n" +
                    "\nեթե դուք չեք ադմինիստրատոր օգտագործող, \n\nխնդրում ենք մի փորձեք մուտք գործել");
            return "admin/login/Login";
        }

    }

    @PostMapping(value = "/admin/Login")
    public String loginCheck(@RequestParam String username, @RequestParam String Password, Model model, HttpSession session) {
        Admin admin = adminServiceimpl.loadAdmin(username, Password);
        if (admin != null) {
            String sessionNameTracker = admin.getAdmin_username();
            session.setAttribute("NameInSession", sessionNameTracker);
            model.addAttribute("AdminId",admin.getId());
            //model.addAttribute("adminInfo", admin);
        } else {
            model.addAttribute("message", "Օգտագործողի անունը կամ գաղտնաբառը սխալ է");
            return "admin/login/Login";
        }
        return "admin/index";
    }
}
