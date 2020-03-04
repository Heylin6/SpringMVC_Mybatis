package com.example.demo.Setting;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConnFactory {
	
private static SqlSessionFactory ssessfactory;
	
	static{
		try{
			String resource ="SqlMapConfig.xml";
			Reader reader= Resources.getResourceAsReader(resource);
			if(ssessfactory ==null){
				ssessfactory= new SqlSessionFactoryBuilder().build(reader);
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSsessfactory() {
		return ssessfactory;
	}
}
