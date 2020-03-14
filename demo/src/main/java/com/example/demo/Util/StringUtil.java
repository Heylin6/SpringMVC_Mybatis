package com.example.demo.Util;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class StringUtil {
	
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
