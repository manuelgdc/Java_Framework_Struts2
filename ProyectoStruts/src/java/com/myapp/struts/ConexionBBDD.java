/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.sql.*;

/**
 *
 * @author Manuel
 */
public class ConexionBBDD {
    
    
        public boolean validar(String email, String pass){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/proyectostruts";

        boolean bien = false;
        
        Connection conexion;
        Statement stmt;
        ResultSet rs;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, "root", "");
            stmt = conexion.createStatement();
            String sql = "select mail from cliente where mail = '"+email+"' and password = '"+pass+"'";
            rs = stmt.executeQuery(sql);
            int cont = 0;
            while(rs.next()){
                cont++;
            }
            if (cont == 1) {
                bien = true;
            }
        }catch (ClassNotFoundException e) {
            System.out.println("Controlador JDBC no encontrado"+e.getMessage());
        } catch (SQLException ex) {
            System.out.println("Excepcion capturada de SQL: "+ex.getMessage());
        }
        return bien;
    }
}
