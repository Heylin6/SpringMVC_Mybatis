package com.example.demo.Service;

import java.net.URLDecoder;
import java.net.URLEncoder;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class MemberService {
	
	private String githubAuthUri ="https://github.com/login/oauth/authorize?";
	private String facebookAuthUri ="";
	private String googleAuthUri ="https://accounts.google.com/o/oauth2/auth?";
	
	private String googleAuthExtraStr = "&state=heylin&response_type=code&scope=https://www.googleapis.com%2Fauth%2Fuserinfo.email+https://www.googleapis.com%2Fauth%2Fuserinfo.profile";
	
	private String githubAuthClientID ="85713c5dc42fa129bc80";
	private String facebookAuthClientID ="";
	private String googleAuthClientID ="737075086035-nnvv54h48pqdo5dhvdhaocsaod7sg8of.apps.googleusercontent.com";
	
	private String githubAuthRedir="http://localhost:8088/auth/githubredir";
	private String facebookAuthRedir="";
	private String googleAuthRedir="http://localhost:8088/auth/googleredir";

	public Model PrepareLoginModel(Model model) {
		
		model.addAttribute("githubAuth", compileUrl(githubAuthUri,githubAuthClientID,githubAuthRedir,""));
		model.addAttribute("facebookAuth", "bbb");
		model.addAttribute("googleAuth", compileUrl(googleAuthUri,googleAuthClientID,googleAuthRedir,googleAuthExtraStr));
		
		return model;
	}

	private String compileUrl(String AuthUri, String ClientID, String Redir, String extraStr) {
		
		return AuthUri+"client_id="+ClientID+"&redirect_uri="+urlEncode(Redir)+extraStr;
	}
	
	  public static String urlDecode(String str) {
	        try {
	            return URLDecoder.decode(str, "UTF-8");
	        } catch (Throwable e) {
	            return str;
	        } 
	    }
	
	  public static String urlEncode(String str){
	        try {
	            return URLEncoder.encode(str, "UTF-8");
	        } catch (Throwable e) {
	            return str;
	        } 
	    }
	  

}
