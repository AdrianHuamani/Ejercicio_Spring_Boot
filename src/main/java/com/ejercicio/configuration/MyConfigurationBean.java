package com.ejercicio.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ejercicio.bean.MyBean;
import com.ejercicio.bean.MyBeanTwoImplement;

@Configuration
public class MyConfigurationBean {

	@Bean
	public MyBean beanOperation(){
		return new MyBeanTwoImplement();
	}
	
}
