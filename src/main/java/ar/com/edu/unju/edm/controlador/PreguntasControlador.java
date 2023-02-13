package ar.com.edu.unju.edm.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.com.edu.unju.edm.servicio.PreguntaServicio;

@Controller
public class PreguntasControlador {
  @Autowired
  PreguntaServicio preguntaServicio;
  
}