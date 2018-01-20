
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
public class ConexionSql {
 
    Connection conexion = null;
    Statement comando = null;
    ResultSet registro;
 
    public Connection MySQLConnect() {
 
        try {
            //Driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //Nombre del servidor. localhost:3306 es la ruta y el puerto de la conexión MySQL
            //panamahitek_text es el nombre que le dimos a la base de datos
            String servidor = "jdbc:mysql://localhost/Biblioteca";
            //El root es el nombre de usuario por default. No hay contraseña
            String usuario = "root";
            String pass = "123";
            //Se inicia la conexión
            conexion = DriverManager.getConnection(servidor, usuario, pass);
 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } finally {
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
            
            
            return conexion;
            
        }
    }
    
//    public static void main(String args[]){
//        
//        try {
//            ConexionSql db = new ConexionSql();
//            db.MySQLConnect();
// 
//            /* Se establece el nombre de la base de datos que contiene 
//             la información que se quiere consultar
//             */
//            String NombreDB = "Items";
//            
//             /* Se establece la consulta que se desea hacer.
//            Select se encargará de seleccionar todos los datos
//            (representado por *) desde (FROM) la base de datos
//            llamada "Registro"
//             */
//            
//            String Query = "SELECT * FROM " + NombreDB;
//            
//            
//            /* Se crea una declaración y se establece el Query que se
//            desea ejecutar
//             */
//            
//            db.comando = db.conexion.createStatement();
//            db.registro = db.comando.executeQuery(Query);
// 
//            /* Se imprimen los registros que estén guardados en 
//            la base de datos
//             */
//            while (db.registro.next()) {
//                
//                System.out.println("Nombre: " + db.registro.getString("Nombre") );
//                
//                System.out.println("------------------------------------------");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MySQL_Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//      
//}
}