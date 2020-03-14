package com.example.demo.Service;

import java.net.URLDecoder;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.Util.StringUtil;

@Service
public class MemberService {
	
	@Value("${social.login.github.AuthUri}")
	private String githubAuthUri;
	// ="https://github.com/login/oauth/authorize?";
	@Value("${social.login.facebook.AuthUri}")
	private String facebookAuthUri;
	// ="https://www.facebook.com/v6.0/dialog/oauth?";
	@Value("${social.login.google.AuthUri}")
	private String googleAuthUri;
	// ="https://accounts.google.com/o/oauth2/auth?";
	
	@Value("${social.login.google.AuthExtra}")
	private String googleAuthExtraStr;
	@Value("${social.login.facebook.AuthExtra}")
	private String facebookAuthExtraStr;
			
	@Value("${social.login.github.ClientID}")
	private String githubAuthClientID;
	@Value("${social.login.facebook.ClientID}")
	private String facebookAuthClientID;
	@Value("${social.login.google.ClientID}")
	private String googleAuthClientID;
	
	@Value("${social.login.github.AuthRedir}")
	private String githubAuthRedir;
	@Value("${social.login.facebook.AuthRedir}")
	private String facebookAuthRedir;
	@Value("${social.login.google.AuthRedir}")
	private String googleAuthRedir;

	public Model PrepareLoginModel(Model model) {
		
		model.addAttribute("githubAuth", 
				compileUrl(githubAuthUri,
							githubAuthClientID,
							githubAuthRedir,
							""));
		model.addAttribute("facebookAuth", 
				compileUrl(facebookAuthUri,
							facebookAuthClientID,
							facebookAuthRedir,
							facebookAuthExtraStr));
		model.addAttribute("googleAuth", 
				compileUrl(googleAuthUri,
							googleAuthClientID,
							googleAuthRedir,
							googleAuthExtraStr));
		
		return model;
	}

	private String compileUrl(String AuthUri, String ClientID, String Redir, String extraStr) {
		
		return AuthUri+"client_id="+ClientID+"&redirect_uri="+StringUtil.urlEncode(Redir)+extraStr;
	}
	

}
