package com.ejercicio.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("ESTE ES UN HOLA MUNDO DE LA SEGUNDA IMPLEMENTACION");
	}

}
