package com.springmvc.logica;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springmvc.model.Persona;

@Component("PersonaDAO")
public class PersonaDAO {
	
	private List<Persona> lisPersonas;
	
	public List<Persona> mostrarPersonasAll(){
		iniciarLista();
		return this.lisPersonas;
	}	
	
	public void agregarPersona(Persona persona){
		iniciarLista();
		this.lisPersonas.add(persona);
	}
	
	private void iniciarLista() {
		if(null == lisPersonas){
			this.lisPersonas = new ArrayList<>(); 
		}
	}
}
