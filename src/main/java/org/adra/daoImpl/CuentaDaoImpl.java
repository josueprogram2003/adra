package org.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import org.adra.config.Conexion;
import org.adra.dao.CuentaDao;

public class CuentaDaoImpl implements CuentaDao {

    Connection cx;
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public HashMap<String, Object> validar(String user, String pass) {
        HashMap<String, Object> datos = new HashMap<>();
        String consulta = "select p.id_p ,p.nombre, p.apellido_p, p.apellido_m, c.id_cuenta from persona p inner join cuenta c where (c.usuario = '"
                + user + "' and c.contraseña = '" + pass + "') and (p.id_cuenta = c.id_cuenta);";
        try {
            System.out.println(user + " " + pass);
            cx = Conexion.getConexion();
            pst = cx.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                datos.put("idpersona", rs.getInt("id_p"));
                datos.put("nombres", rs.getString("nombre") + " " + rs.getString("apellido_p") + " " + rs.getString("apellido_m"));
                datos.put("idcuenta", rs.getInt("id_cuenta"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return datos;
    }

}
