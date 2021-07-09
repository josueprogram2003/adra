package org.adra.model;

public class Banco_Comunal {
	
	int id_banco;
	String nombre;
	
	public Banco_Comunal(int id_banco, String nombre) {
		super();
		this.id_banco = id_banco;
		this.nombre = nombre;
	}

	public Banco_Comunal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId_banco() {
		return id_banco;
	}

	public void setId_banco(int id_banco) {
		this.id_banco = id_banco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
