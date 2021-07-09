package org.adra.model;
public class Cargo {
	
	int id_c;
	String nombre;
	
	public Cargo(int id_c, String nombre) {
		super();
		this.id_c = id_c;
		this.nombre = nombre;
	}

	public Cargo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId_c() {
		return id_c;
	}

	public void setId_c(int id_c) {
		this.id_c = id_c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
