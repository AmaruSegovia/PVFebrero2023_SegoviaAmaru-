package ar.com.edu.unju.edm.usuario;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "notas")
public class UsuarioPregunta {
  @Id
  @GeneratedValue
  (strategy=GenerationType.IDENTITY)
  private Long Id;
  private Integer Puntaje;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "dni")
  private Usuario usuario;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name ="CodPregunta")
  private Pregunta pregunta;
  public UsuarioPregunta(Long id, Integer puntaje, Usuario usuario, Pregunta pregunta) {
    Id = id;
    Puntaje = puntaje;
    this.usuario = usuario;
    this.pregunta = pregunta;
  }
  public UsuarioPregunta() {
  }
  public Long getId() {
    return Id;
  }
  public void setId(Long id) {
    Id = id;
  }
  public Integer getPuntaje() {
    return Puntaje;
  }
  public void setPuntaje(Integer puntaje) {
    Puntaje = puntaje;
  }
  public Usuario getUsuario() {
    return usuario;
  }
  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
  public Pregunta getPregunta() {
    return pregunta;
  }
  public void setPregunta(Pregunta pregunta) {
    this.pregunta = pregunta;
  }
}