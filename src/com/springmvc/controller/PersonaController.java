package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.logica.PersonaDAO;
import com.springmvc.model.Persona;

@Controller
public class PersonaController {
	
	@Autowired
	private PersonaDAO dao;
	
	@RequestMapping( value = "/irRegistrarPersona", method=RequestMethod.GET)
	public String irRegistarPersona(Model model ){
		model.addAttribute(new Persona());
		return "resgistrarPersona";
	}
	
	@RequestMapping( value = "/irRegistrarPersona", method=RequestMethod.POST)
	public String registarPersona(Persona persona){
		dao.agregarPersona(persona);
		return "redirect:/personaAll/";
		
	}
	
	@RequestMapping( value = "/personaAll", method=RequestMethod.GET)
	public String buscarPersonaAll(Model model ){
		 model.addAttribute("PersonaList",dao.mostrarPersonasAll());
		 return "personaAll";
	}

}
