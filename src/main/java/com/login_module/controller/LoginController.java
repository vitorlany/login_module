package com.login_module.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<?> longIn() {
        return ResponseEntity.ok("Logged!");
    }

    @PostMapping("/register")
    public ResponseEntity<?> register() {
        return ResponseEntity.ok("Registered!");
    }
}
