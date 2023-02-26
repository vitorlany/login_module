package com.login_module;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/hello")
    public ResponseEntity<?> testRoute() {
        return ResponseEntity.ok("World!");
    }
}
