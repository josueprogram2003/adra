package org.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.adra.config.Conexion;
import org.adra.dao.AreaDao;
import org.adra.model.Area;



public class AreaDaoImpl  implements AreaDao{
	
	Connection cx;
	PreparedStatement pst;
	ResultSet rs;
	int r=0;
	
	@Override
	public int insertar(String nombre) {
		String consulta="insert into area(nombre)values('"+nombre+"');";
		try {
			System.out.println(nombre);
			cx=Conexion.getConexion();
			pst=cx.prepareStatement(consulta);
			r=pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error: "+e);
			return 0;
		}
		return r;
	}
	
	@Override
	public List<Area> buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> listar() {
		List<Area> lista = new ArrayList<>();
		String consulta = "select * from area";
		try {
			cx = Conexion.getConexion();
			pst = cx.prepareStatement(consulta);
			rs = pst.executeQuery();
			while (rs.next()) {
				Area a = new Area();
				a.setId_area(rs.getInt("id_area"));
				a.setNombre(rs.getString("nombre"));
				lista.add(a);
			}
		} catch (SQLException e) {
			System.out.println("Error"+e);
			return null;
		}
		return lista;
	}

}
