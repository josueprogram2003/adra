package org.adra.dao;

import java.util.List;
import org.adra.model.Area;



public interface AreaDao {
	int insertar(String nombre);
	List<Area> listar();
	List<Area> buscar(int id);
	
}
