
package com.mycompany.dao;


import com.mycompany.conexionDB.ConexionDB;
import com.mycompany.entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoDao {
    //FELIPE ACA DELE CTRL Y ESPACIO AL CONEXION PARA IMPORTAR EL PAQUETE DONDE ESTA LA CLASE CONEXIONDB
      private ConexionDB conexionDB;
      private PreparedStatement statement;
      private ResultSet resultSet;
      // constructor
    public ProductoDao() {
        this.conexionDB= new ConexionDB();
        this.statement = null;
        this.resultSet = null;
    }
    public ResultSet queryProcuto(){
        Connection myCon = this.conexionDB.getConexionDB();
        String query = "SELECT * FROM productos; ";
          try {
              this.statement = myCon.prepareStatement(query);
              this.resultSet = this.statement.executeQuery();
          } catch (SQLException ex) {
              System.err.println(""+ex.getErrorCode());
          }
        return this.resultSet;
    }
    
    
    // ctrl + espacio en producto para importar
    public void registrarProducto (Producto producto){
        //ctrl + espacio en myCon para importar
        Connection myCon = this.conexionDB.getConexionDB();
        String query = "INSERT INTO productos VALUES (NULL,?,?,?);";
        try {
            if(this.statement==null){
                this.statement = myCon.prepareStatement(query);
                this.statement.setString(1, producto.getProductoNombre());
                this.statement.setString(2, producto.getProductoDescripcion());
                this.statement.setInt(3, 1);
                int response = this.statement.executeUpdate();
                if (response > 0){
                    JOptionPane.showMessageDialog(null, "OK-200 "+response);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no se pudo registrar ");
            System.out.println(""+e.getMessage());
        } finally {
            if(myCon != null){

                try {
                    this.statement.close();
                    myCon.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
            }
        }
        
        
    }
      
}
