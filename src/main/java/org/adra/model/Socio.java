package org.adra.model;

public class Socio {
	
	int id_p;
	int id_banco;
	
	public Socio(int id_p, int id_banco) {
		super();
		this.id_p = id_p;
		this.id_banco = id_banco;
	}

	public Socio(int id_banco) {
		super();
		this.id_banco = id_banco;
	}

	public int getId_p() {
		return id_p;
	}

	public void setId_p(int id_p) {
		this.id_p = id_p;
	}

	public int getId_banco() {
		return id_banco;
	}

	public void setId_banco(int id_banco) {
		this.id_banco = id_banco;
	}
	
	
	
	
	
}
