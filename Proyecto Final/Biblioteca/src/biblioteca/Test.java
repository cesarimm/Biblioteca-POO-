/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cat Plata
 */
public class Test {
    
    
    public static void main (String args[]) throws SQLException{
      ArrayList<Items> Lista = new ArrayList<Items>();
    ArrayList<Usuarios> Users = new ArrayList<Usuarios>();
    
    
    MetodosJ m= new MetodosJ();
    
    //m.conectar();
    
//    Alumno a1 = new Alumno("OOonimo", "AArez" , "González", "234", "2300", "99", "91919219", "Sistemas", "2cm1 ", "tercero");
//
//
////a1.Agregar();
MetodosJ m1= new MetodosJ();

if(m1.BuscarItems("ElPe1987")==true){
    System.out.println("Si existe");
}else{
    System.out.println("NO existe");
}


if(m1.BuscarUsuarios("pabe461")==true){
    System.out.println("Si existe");
}else{
    System.out.println("NO existe");
}

if(m1.BuscarDisponibilidad("jija2008")==true){
    System.out.println("Si Disponible");
}else{
    System.out.println("NO Disponible");
}

//
//m1.EliminarAlumno("OOAA94");
//      Biblioteca b1 = new  Biblioteca("Sapito", "En la upiixz ", "Pepito ","828288");
//      
//      Alumno a1 = new Alumno("Geronimo", "Perez" , "González", "234", "2300", 99, "91919219", "Sistemas", "2cm1 ", "tercero");
//      Alumno a2 = new Alumno("Cesar", "Ivan" , "González", "224", "hola81", 100, "91919219", "Sistemas", "2cm1 ", "tercero");
////      a2.conectar();
////      a1.conectar();
//      
//Libros L1= new Libros("Jitomate", "PPdro H.", "PP camaleon", "Mexico D.F ", 1988, "Bueno", "Porrua", "Ficcion", "22", "199");
//L1.Agregar();

//m1.Eliminarlibros("ElPe1987");

//      Libros L2 = new Libros(191, "Claudia H.", " El  ", "Mexico D.F ", 1972, "Malo", "La mia "); /// No esta disponible en labiblioteca
//      
//      //Revistas r1 = new Revistas(" 34ce23", " Patrick", " Bruno ", " Rosales", 56," catorce", 12, "ciencia");
//      Tesis t1=  new Tesis(339, " zacarias", " Catalina", "camil ", 23, "Excelente", "zoologia","soso", "Biologia");
//   

//Tesis T1=new Tesis("joajs", "jadro jo", "jilhd", "hdksla", 2008, "hkal", "hdjls", "Chalaa", "Chlala", "Chalaa", "Chalal", "halala");
//T1.Agregar();
//    L1.conectar();
//    L2.conectar();
//    t1.conectar();

//Profesor p1= new Profesor("Pancho", "Perez" , "González", "tes", "2300", "shalala", "91919", "Sistemas");
//      p1.Agregar();
//      Lista.add(t1);
//      //Lista.add(r1);
//      Lista.add(L1);
//      
//      Users.add(a1);
//      
//      b1.setLista(Lista);
//      b1.setUsers(Users);
//      
//      
//      
//      
//      Prestamos pre1= new Prestamos(L1, a1, "Excelente");
//      Prestamos pre2=new Prestamos(L2, a1, "Malo");
//      
//      pre1.setLista(Lista);
//      pre1.setUsers(Users);
//      
//      
//      pre2.setLista(Lista);
//      pre2.setUsers(Users);
//      
//     
//      //Consultas con1= new Consultas(r1, "Bueno");
//      
//        //con1.setLista(Lista);
//      
//      
//      System.out.println("Ejemplo 1");
//      pre1.Reporte();
//      System.out.println("Ejemplo 2");
//      pre2.Reporte();
//      System.out.println("Ejemplo 3");
//      //con1.Reporte();
//      
//      Lista.add(L2);
//      
//      
//    
//       Prestamos pre3=new Prestamos(L2, a1, "Malo");
//       Consultas con2= new Consultas(t1, "Bueno");
//       
//       pre3.setLista(Lista);
//      pre3.setUsers(Users);
//       
//      
//        con2.setLista(Lista);
//        
//       System.out.println("Ejemplo 4");
//       pre3.Reporte();
//       System.out.println("Ejemplo 5");
//       con2.Reporte();
    }
    
}
