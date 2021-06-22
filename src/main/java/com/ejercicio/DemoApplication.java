package com.ejercicio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejercicio.bean.MyBean;
import com.ejercicio.component.ComponentDependency;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	
	public DemoApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean) {
		this.componentDependency=componentDependency;
		this.myBean=myBean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		componentDependency.saludar();
		myBean.print();
	}

}
