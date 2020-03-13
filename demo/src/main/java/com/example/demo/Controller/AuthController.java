package com.example.demo.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	  @RequestMapping(value = "/facebookredir")
	  public void facebookredirect(HttpServletResponse res) throws IOException {
	    
		  //查看回傳的id有無在資料庫
		  //
		  //假設 有 轉址登入後畫面		  
	  }
	  
	  @RequestMapping(value = "/googleredir")
	  public void googleredirect(HttpServletResponse res) throws IOException {
	    
		  //查看回傳的id有無在資料庫
		  //
		  //假設 有 轉址登入後畫面		  
	  }
	  
	  @RequestMapping(value = "/githubredir")
	  public void githubredirect(HttpServletResponse res) throws IOException {
	    
		  //查看回傳的id有無在資料庫
		  //
		  //假設 有 轉址登入後畫面		  
	  }
}
