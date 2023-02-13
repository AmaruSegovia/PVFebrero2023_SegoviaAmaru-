package ar.com.edu.unju.edm.servicio;

import java.util.List;

import ar.com.edu.unju.edm.usuario.Pregunta;

public interface PreguntaServicio {
  public List<Pregunta> listarPreguntasPorNivel(Integer nivel); 
}