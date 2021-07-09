package org.adra.dao;


import java.util.HashMap;

public interface CuentaDao {
	HashMap<String, Object> validar(String user, String pass);
}
