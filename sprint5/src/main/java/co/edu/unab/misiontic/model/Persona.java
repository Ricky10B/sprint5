package co.edu.unab.misiontic.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona implements Serializable{
	private static final long serialVersionUID = 6941608349198514803L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 25, nullable=false)
	private String nombre;
	
	@Column(length = 25, nullable=false)
	private String apellido;
	
	@Column(length = 1, nullable=false)
	private Character genero;
	
	@Column(length = 5, nullable=false)
	private Double estatura;
	
	@Column(length = 5, nullable=false)
	private Double peso;
	
	@Column(length = 5)
	private Double imc;
	
	@Column(length = 255)
	private String email;
	
	private Timestamp fecha_Registro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Character getGenero() {
		return genero;
	}
	public void setGenero(Character genero) {
		this.genero = genero;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getFechaRegistro() {
		return fecha_Registro;
	}
	public void setFechaRegistro(Timestamp fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}	
	
}
