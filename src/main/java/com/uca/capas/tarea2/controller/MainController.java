package com.uca.capas.tarea2.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/alumno") 
	public @ResponseBody String alumno() {
		String nombre = "Paola", 
				apellido = "Dominguez", 
				carnet = "00352318", 
				carrera = "Ingenieria Informatica", 
				anio = "tercer anio";
				
				return "Mi nombre es " + nombre + " " + apellido + ", mi numero de carnet es: " + carnet 
						+ ", estudio la carrera de " + carrera + " y estoy cursando el " + anio;
	}

	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer dia = Integer.parseInt(request.getParameter("dia"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));
		Integer anio = Integer.parseInt(request.getParameter("anio"));
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		
		return "El dia de la semana fue: " + DayOfWeek.from(fecha); 
	}
}
