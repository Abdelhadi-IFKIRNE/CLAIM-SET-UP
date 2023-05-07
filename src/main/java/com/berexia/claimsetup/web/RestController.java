package com.berexia.claimsetup.web;

import org.springframework.web.bind.annotation.GetMapping;

public class RestController {
    @GetMapping("/")
    public String getMessage(){
        return "CLAIM SET UP START ....";
    }
}
