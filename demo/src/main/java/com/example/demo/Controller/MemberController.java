package com.example.demo.Controller;


import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;
import com.example.demo.Model.member;
import com.example.demo.Service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService _MemrServ;
	
	@GetMapping("/login")
    public String login(@ModelAttribute member member,Model model){

		_MemrServ.PrepareLoginModel(model);
        return "login";
    }
	
	@GetMapping("/")
    public Principal getMember(Principal user){

        return user;
    }
	
	@GetMapping("/restricted")
    public String restricted(){

        return "aaaccc";
    }
}
