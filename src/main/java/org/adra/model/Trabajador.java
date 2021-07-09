package org.adra.model;

public class Trabajador {
	
	int id_p;
	int id_c;
	
	public Trabajador(int id_p, int id_c) {
		super();
		this.id_p = id_p;
		this.id_c = id_c;
	}

	public int getId_p() {
		return id_p;
	}

	public void setId_p(int id_p) {
		this.id_p = id_p;
	}

	public int getId_c() {
		return id_c;
	}

	public void setId_c(int id_c) {
		this.id_c = id_c;
	}
	
	
	
	
}
