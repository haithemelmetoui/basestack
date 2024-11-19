package com.demo.basestack.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeEndPoint {

    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello User";
    }
}
