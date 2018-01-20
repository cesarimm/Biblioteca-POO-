/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class MetodosJ {
    
    
   
    private Connection conexion;
    
    
  public Connection getConexion() {
	return conexion;
}   
  
public void setConexion(Connection conexion) {
        this.conexion = conexion;
}  
    

    public MetodosJ conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost/biblioteca?user=root&password=123";
            setConexion(DriverManager.getConnection(BaseDeDatos));
            if(getConexion() != null){
                System.out.println("Conexion Exitosa!");
            }else{
                System.out.println("Conexion Fallida!");                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    
   public boolean ejecutar(String sql) {
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }        return true;
    }
    
    
    
    public ResultSet consultar(String sql) {
       
        ResultSet resultado;
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        return resultado;
    }
    
    
    
    
    ////Metodos 
    
    
        public void EliminarPrestamo (String id){
        MetodosJ m1= new MetodosJ();
        
        String a="DELETE FROM prestamo where id_prestamo='"+id+"'";

        String b="DELETE FROM prestamo_items` where id_prestamo_items`='"+id+"'";
        
         
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);
        
      // System.out.println(a);
        
    }
    public void EliminarAlumno(String id){
        MetodosJ m1= new MetodosJ();
        
        String a="DELETE FROM alumnos where id_alumno='"+id+"'";

        String b="DELETE FROM usuarios where id_usuario='"+id+"'";
        
         
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);
        
      // System.out.println(a);
        
    }
    
      public void EliminarProfesor(String id){
        MetodosJ m1= new MetodosJ();
        
        String a="DELETE FROM profesor where id_profesor='"+id+"'";

        String b="DELETE FROM usuarios where id_usuario='"+id+"'";
        
         
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);
        
    
        
    }

       public void Eliminartesis(String id){
        MetodosJ m1= new MetodosJ();
        
        String a="DELETE FROM tesis where id_tesis='"+id+"'";

        String b="DELETE FROM items where id_items='"+id+"'";
        
         
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);
        
    
        
    }

       
         public void Eliminarlibros(String id){
             
        MetodosJ m1= new MetodosJ();
        
        String a="DELETE FROM libro where id_libro='"+id+"'";

        String b="DELETE FROM items where id_items='"+id+"'";
        
         
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);
        
    
        
    }
         
         
         
        public boolean BuscarUsuarios(String id){
             
        MetodosJ m1= new MetodosJ();
        String A="";
        
        String a="SELECT * FROM usuarios WHERE id_usuario='"+id+"'";

      
        
         ResultSet resultados=m1.conectar().consultar(a);
        if (resultados != null) {
            try {
//                System.out.println("Nombre       ApellidoP");
//                System.out.println("--------------------------------");
                while (resultados.next()) {
                    A  = resultados.getString("nombre");
                }
                  
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }
        
        String B="";
       
       // System.out.println(A);
        
       if(A.equals(B)){
           return false;
       }else{
           return true;
       }
       
     } 
        
        
        
        
       public boolean BuscarItems(String id){
             
        MetodosJ m1= new MetodosJ();
        String A="";
        
        String a="SELECT * FROM items  WHERE id_items='"+id+"'";

      
        
         ResultSet resultados=m1.conectar().consultar(a);
        if (resultados != null) {
            try {
//                System.out.println("Nombre       ApellidoP");
//                System.out.println("--------------------------------");
                while (resultados.next()) {
                    A  = resultados.getString("nombre");
                }
                  
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }
        
        String B="";
       
       // System.out.println(A);
        
       if(A.equals(B)){
           return false;
       }else{
           return true;
       }
       
     }  
        
       
        public boolean BuscarDisponibilidad(String id){
             
        MetodosJ m1= new MetodosJ();
        String A="";
        
        String a="SELECT * FROM items  WHERE id_items='"+id+"'";

      
        
         ResultSet resultados=m1.conectar().consultar(a);
        if (resultados != null) {
            try {
//                System.out.println("Nombre       ApellidoP");
//                System.out.println("--------------------------------");
                while (resultados.next()) {
                    A  = resultados.getString("disponibilidad");
                }
                  
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }
        
        String B="N0";
       
       // System.out.println(A);
        
       if(A.equals(B)){
           return false;
       }else{
           return true;
       }
       
     }  
        
         

    
      
// public static void main(String[] args) {
//       MetodosJ baseDatos = new MetodosJ().conectar();
////        
////        
////        ///Agregar
// //if (baseDatos.ejecutar("INSERT INTO usuario (IdUsuario, Nombre, ApellidoP, ApellidoM, Direccion, Telefono)"+ "values(39, 'Pedro', 'Gonzalez', 'Martinez', 'Allende', '46292')")) {
//    if (baseDatos.ejecutar("Insert INTO alumnos (id_alumno, matricula, programa, grupo, semestre)" +"values('GePe351' , '91919219' , 'Sistemas' , '2cm1 ' , 'tercero')")) {
//          System.out.println("Ejecución correcta!");
//       } else {
//           System.out.println("Ocurrió un problema al ejecutar!");
//       }      
//////       
///////Eliminar
//////       if (baseDatos.ejecutar("DELETE FROM usuario where idUsuario =39")) {
//////          System.out.println("Ejecución correcta!");
//////       } else {
//////           System.out.println("Ocurrió un problema al ejecutar!");
//////       } 
////
//////Modificar
////         if (baseDatos.ejecutar(" UPDATE usuario SET Nombre=\"Wero\" WHERE idUsuario=12")) {
////          System.out.println("Ejecución correcta!");
////       } else {
////           System.out.println("Ocurrió un problema al ejecutar!");
////       } 
////       
////       ///Buscar
////        ResultSet resultados = baseDatos.consultar("SELECT * FROM usuario WHERE idUsuario= '12'");       
////        if (resultados != null) {
////            try {
////                System.out.println("Nombre       ApellidoP");
////                System.out.println("--------------------------------");
////                while (resultados.next()) {
////                    System.out.println(""+resultados.getString("Nombre")+"       "+resultados.getString("ApellidoP"));
////                }
////            } catch (Exception e) {
////                e.printStackTrace();
////            }
////        }
//   }
   
}
