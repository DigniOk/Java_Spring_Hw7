package ru.gb.Java_Spring_Hw7.controller;

import ru.gb.Java_Spring_Hw7.service.AdminService;
import ru.gb.Java_Spring_Hw7.service.HomeService;
import ru.gb.Java_Spring_Hw7.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private final HomeService homeService;
    private final UserService userService;
    private final AdminService adminService;

    public HomeController(HomeService homeService, UserService userService, AdminService adminService) {
        this.homeService = homeService;
        this.userService = userService;
        this.adminService = adminService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("text", homeService.getText());
        return "index.html";
    }

    @GetMapping("/index")
    public String index() {
        return "redirect:/";
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("text", userService.getText());
        return "public-data.html";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("text", adminService.getText());
        return "private-data.html";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }
}