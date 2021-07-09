package org.adra.model;

public class Persona {
	
	int id_p;
	String nombre;
	String apellido_p;
	String apellido_m;
	String dni;
	String gmail;
	int id_cuenta;
	
	
	
	public Persona() {
		super();
	}

	public Persona(int id_p, String nombre, String apellido_p, String apellido_m, String dni, String gmail,
		int id_cuenta) {
		super();
		this.id_p = id_p;
		this.nombre = nombre;
		this.apellido_p = apellido_p;
		this.apellido_m = apellido_m;
		this.dni = dni;
		this.gmail = gmail;
		this.id_cuenta = id_cuenta;
	}

	public Persona(String nombre, String apellido_p, String apellido_m, String dni, String gmail, int id_cuenta) {
		super();
		this.nombre = nombre;
		this.apellido_p = apellido_p;
		this.apellido_m = apellido_m;
		this.dni = dni;
		this.gmail = gmail;
		this.id_cuenta = id_cuenta;
	}

	public int getId_p() {
		return id_p;
	}

	public void setId_p(int id_p) {
		this.id_p = id_p;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_p() {
		return apellido_p;
	}

	public void setApellido_p(String apellido_p) {
		this.apellido_p = apellido_p;
	}

	public String getApellido_m() {
		return apellido_m;
	}

	public void setApellido_m(String apellido_m) {
		this.apellido_m = apellido_m;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}
	
	
	
	
	
}
