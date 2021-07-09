package org.adra.model;

public class Area {
	int id_area;
	String nombre;
	public Area(int id_area, String nombre) {
		super();
		this.id_area = id_area;
		this.nombre = nombre;
	}
	public Area() {
		super();
	}
	public Area(String nombre) {
		super();
		this.nombre = nombre;
	}
	public int getId_area() {
		return id_area;
	}
	public void setId_area(int id_area) {
		this.id_area = id_area;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
