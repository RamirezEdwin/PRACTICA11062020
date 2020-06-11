package com.isaac.holamundo.holamundo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaac.holamundo.Model.Persona;

@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		
		
		Persona person = new Persona();
		person.setNombre("Edwin");
		person.setApellido("Ramirez");
		person.setTelefono("76891100");
		person.setEmail("rh0238032011@unab.edu.sv");
		
		
		Persona person2 = new Persona();
		person2.setNombre("Isaac");
		person2.setApellido("Henriquez");
		person2.setTelefono("79577405");
		person2.setEmail("edrmix@gmail.com");
		
		List personas = (List) Arrays.asList(person,person2);
		
		
		
		String mesaje = "hola desde el controlador";
		//modelo.addAttribute("saludo", mesaje);
		modelo.addAttribute("personas",personas);
		
		
		
		return "index";
		 
	}
	
	
}
