package clases;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Usuario {
	private byte id;
	private String nombre;
	private String apellido;
	private LocalDate fechaLogin;
	private Provincia provincia;
	
	
	
	public Usuario(byte id, String nombre, String apellido, LocalDate fechaLogin, Provincia provincia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaLogin = fechaLogin;
		this.provincia = provincia;
	}



	public byte getId() {
		return id;
	}



	public void setId(byte id) {
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



	public LocalDate getFechaLogin() {
		return fechaLogin;
	}



	public void setFechaLogin(LocalDate fechaLogin) {
		this.fechaLogin = fechaLogin;
	}



	public Provincia getProvincia() {
		return provincia;
	}



	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaLogin=" + fechaLogin
				+ ", provincia=" + provincia + "]";
	}


	
}
