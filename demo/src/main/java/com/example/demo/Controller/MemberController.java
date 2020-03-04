package com.example.demo.Controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MemberController {
	
	//	http://localhost:8088/login/oauth2/code/google
	@GetMapping("/login")
    public String login(@ModelAttribute String member){

        return "login";
    }
	
	@GetMapping("/")
    public String helloworld(){

        return "helloworld";
    }
	
	@GetMapping("/restricted")
    public String restricted(){

        return "aaaccc";
    }
}
