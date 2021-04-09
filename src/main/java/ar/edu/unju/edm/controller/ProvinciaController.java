package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;
@Controller
public class ProvinciaController {
//	Provincia unaProvincia=new Provincia();
	@Autowired
	Provincia unaProvincia;
	
	@GetMapping({"/provincia-jujuy"})
	 public String cargarProvincia(Model model) {
	 unaProvincia.setNombreDeProvincia("Salta Argentina");
	model.addAttribute("cesar", unaProvincia);
	  return "provincia-jujuy";
	 }
	
	}
