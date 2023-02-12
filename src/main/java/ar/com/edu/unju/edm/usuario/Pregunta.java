package ar.com.edu.unju.edm.usuario;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta {
  @Id
  private Long CodPregunta;
  private String Enunciado;
  private Integer Nivel;
  private String Opcion01;
  private String Opcion02;
  private String Opcion03;
  private String Opcion04;
  private String OpcionCorrecta;
  private Integer Puntaje;
  public Pregunta(Long codPregunta, String enunciado, Integer nivel, String opcion01, String opcion02, String opcion03,
      String opcion04, String opcionCorrecta, Integer puntaje) {
    CodPregunta = codPregunta;
    Enunciado = enunciado;
    Nivel = nivel;
    Opcion01 = opcion01;
    Opcion02 = opcion02;
    Opcion03 = opcion03;
    Opcion04 = opcion04;
    OpcionCorrecta = opcionCorrecta;
    Puntaje = puntaje;
  }
  public Long getCodPregunta() {
    return CodPregunta;
  }
  public void setCodPregunta(Long codPregunta) {
    CodPregunta = codPregunta;
  }
  public String getEnunciado() {
    return Enunciado;
  }
  public void setEnunciado(String enunciado) {
    Enunciado = enunciado;
  }
  public Integer getNivel() {
    return Nivel;
  }
  public void setNivel(Integer nivel) {
    Nivel = nivel;
  }
  public String getOpcion01() {
    return Opcion01;
  }
  public void setOpcion01(String opcion01) {
    Opcion01 = opcion01;
  }
  public String getOpcion02() {
    return Opcion02;
  }
  public void setOpcion02(String opcion02) {
    Opcion02 = opcion02;
  }
  public String getOpcion03() {
    return Opcion03;
  }
  public void setOpcion03(String opcion03) {
    Opcion03 = opcion03;
  }
  public String getOpcion04() {
    return Opcion04;
  }
  public void setOpcion04(String opcion04) {
    Opcion04 = opcion04;
  }
  public String getOpcionCorrecta() {
    return OpcionCorrecta;
  }
  public void setOpcionCorrecta(String opcionCorrecta) {
    OpcionCorrecta = opcionCorrecta;
  }
  public Integer getPuntaje() {
    return Puntaje;
  }
  public void setPuntaje(Integer puntaje) {
    Puntaje = puntaje;
  }
}