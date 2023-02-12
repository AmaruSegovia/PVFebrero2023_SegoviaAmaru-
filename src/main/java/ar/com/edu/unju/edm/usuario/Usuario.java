package ar.com.edu.unju.edm.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	private long dni;
	
	@Column(name = "nombre",nullable = false,length = 50)
	private String nombre;
	
	@Column(name = "apellido",nullable = false,length = 50)
	private String apellido;
	
	@Column(name = "fecha_nac",nullable = false,length = 50)
	private String fecha_nac;
	@Column(name = "tipo",nullable = false,length = 50)
	private String tipo;
	@Column(name = "contrasena",nullable = false,length = 50)
	private String password;
	private Boolean estado;


	public Usuario(long dni, String nombre, String apellido, String fecha_nac, String tipo, String password,
			Boolean estado) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
		this.tipo = tipo;
		this.password = password;
		this.estado = estado;
	}

	public Usuario() {
		super();
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}