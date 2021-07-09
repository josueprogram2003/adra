package org.adra.config;

public class Test {

    public static void main(String[] args) {

        if (Conexion.getConexion() != null) {
            System.out.println("Conectado");
        } else {
            System.out.println("No Conectado");
        }
    }
}
