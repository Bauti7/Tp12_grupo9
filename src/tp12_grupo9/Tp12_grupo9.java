
package tp12_grupo9;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Tp12_grupo9 {

    public static void main(String[] args) {
        
        try {
            //Cargo Driver

            Class.forName("org.mariadb.jdbc.Driver");
            
            //Conexión
            
            String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario = "root";
            String password = "";
            
            Connection con = DriverManager.getConnection(URL,usuario,password);
            
            
            // ---------- INSERTAR EMPLEADOS ----------
            
//            String sql1 = "INSERT INTO empleado (dni, apellido, nombre, acceso, estado)"
//                    
//                    + "VALUES (41789922,'Altamirano','Juan', 1 , true)";
//            
//            PreparedStatement ps = con.prepareStatement(sql1);
//            
//            int filas = ps.executeUpdate();
//            
//            if(filas > 0){
//            
//                JOptionPane.showMessageDialog(null, "Empleado cargado");
//            
//            }

            // ---------- INSERTAR HERRAMIENTAS ----------
            
//            String sql2 = "INSERT INTO herramienta (nombre, descripcion, stock, estado)"
//                    
//                    + "VALUES ('Tirabuzones', 'Hierro', 13, true)";
//            
//            PreparedStatement ps = con.prepareStatement(sql2);
//            
//            int filas = ps.executeUpdate();
//            
//            if(filas > 0){
//                
//                JOptionPane.showMessageDialog(null, "Herramienta cargada");
//            
//            }

              // ---------- LISTAR HERRAMIENTAS CON STOCK SUPERIOR A 10 ----------
              
//              String sql3 = "SELECT * FROM herramienta WHERE stock > 10 ";
//              
//              PreparedStatement ps = con.prepareStatement(sql3);
//              
//              ResultSet rs = ps.executeQuery();
//              
//              while(rs.next()){
//              
//                  String nombre1 = rs.getString("nombre");
//                  String descripcion1 = rs.getString("descripcion");
//                  int stock1 = rs.getInt("stock");
//                  boolean estado1 = rs.getBoolean("estado");
//                  
//                  System.out.println("");
//                  
//                  System.out.println("-------- HERRAMIENTAS --------");
//                  
//                  System.out.println("");
//                  
//                  System.out.println("Nombre: " + nombre1);
//                  System.out.println("Descripción: " + descripcion1);
//                  System.out.println("Stock: " + stock1);
//                  System.out.println("Estado: " + estado1);
//              
//              }
//              
//              con.close();

                // -------- DAR DE BAJA UN EMPLEADO --------
                
//                String sql4 = "DELETE FROM empleado WHERE dni = 41789212";
//                
//                PreparedStatement ps = con.prepareStatement(sql4);
//                
//                int dardebaja = ps.executeUpdate();
//                
//                if(dardebaja > 0){
//                
//                    JOptionPane.showMessageDialog(null, "Empleado eliminado");
//                
//                }else{
//                
//                    JOptionPane.showMessageDialog(null, "No existe ese empleado");
//                
//                }
            
            
        } catch (ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, "Error a cargar Driver");
            
        } catch (SQLException ex) {
            
            int error = ex.getErrorCode();
            
            if( error == 1146){
                
                JOptionPane.showMessageDialog(null, "Tabla inexistente");
            
            }else if(error == 1062){
            
                JOptionPane.showMessageDialog(null, "DNI duplicado");
            
            }else if(error == 1049){
            
                JOptionPane.showMessageDialog(null, "BD inexistente");
            
            }else{
            
                JOptionPane.showMessageDialog(null, "Error");
            
            }
            
            JOptionPane.showMessageDialog(null, "Error de conexión");
            
            ex.printStackTrace();
            
            System.out.println("Codigo de error " + ex.getErrorCode());
            
        }
        
    }
    
}
