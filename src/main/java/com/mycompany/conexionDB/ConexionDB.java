/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class ConexionDB {

    private String user; //usurio de conexion a la BD
    private String password; //contraseña de conexion a la BD
    private String nameDataBase; //nombre de la BD
    private String portMotor;
    private String servidor;
    private String cadUrl;
    private Connection con;

    public ConexionDB() {
        this.user = "root";
        this.password = "";
        this.nameDataBase = "tiendita";
        this.portMotor = "3306";
        this.servidor = "localhost";
        this.cadUrl = "jdbc:mysql://" + this.servidor + ":" + this.portMotor
                + "/" + this.nameDataBase;
        this.con = null;

    }

    private Connection conexionTiendita() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection(this.cadUrl, this.user, this.password);
            JOptionPane.showMessageDialog(null, "Me conecté a mi tiendita");

        } catch (Exception e) {
            System.out.println("*********Excepción*************" + e.getMessage());
            this.con = null;
        }
        return this.con;
    }
    
    public Connection getConexionDB(){
        return this.conexionTiendita();
    }

}
