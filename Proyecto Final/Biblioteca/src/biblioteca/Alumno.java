/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.SQLException;



/**
 *
 * @author Alumno
 */
public class Alumno extends Usuarios{
    
     protected String Matricula;
      protected String Programa;
       protected String Grupo;
        protected String Semestre;   
    MetodosJ m1= new MetodosJ();
    
    public Alumno(String nombre, String pa, String ma, String Dire, String Tele, String id, String Matricula, String Programa, String gru, String seme) throws SQLException {
        super(nombre, pa, ma, Dire, Tele, id);
        
        this.Programa=Programa;
        this.Semestre=seme;
        this.Matricula=Matricula;
        this.Grupo=gru;
        
      
        
    
        
       
}
  
    
    
    public void Agregar(){
        
        String a;
        String b;
        this.ID=this.generarId();
       
      a="Insert INTO usuarios (id_usuario, nombre, apellidoP,apellidoM, direccion, telefono)" + " values('"+this.ID+"' , '"+this.Nombre+"' , '"+this.Apaterno+"' , '"+this.Amaterno+"' , '"+this.Direccion+"' , '"+this.Telefono+"')";
      b="Insert INTO alumnos (id_alumno, matricula, programa, grupo, semestre)" + " values('"+this.ID+"' , '"+this.Matricula+"' , '"+this.Programa+"' , '"+this.Grupo+"' , '"+this.Semestre+"')";
      
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);

//System.out.println(b);

    }
    

  
    
    
    
   
    
    
   

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
        
    }
    
    
    
     
    
    
//     public static void main(String[] args) throws SQLException {
//         
//         
////Alumno a1 = new Alumno("OOonimo", "AArez" , "González", "234", "2300", "99", "91919219", "Sistemas", "2cm1 ", "tercero");
//
//
////a1.Agregar();
//
//Profesor p1= new Profesor("Pancho", "Perez" , "González", "tes", "2300", "shalala", "91919", "Sistemas");
//
//p1.Agregar();
//
////         String a="PEDRO";
////         String f="FERNANDEZ";
////         
////         String b= a.substring(0, 2);
////         String c= f.substring(0, 2);
////              
////                      int ale=(int)(Math.random()*500+7);     
////
////
////     String a1="PEDRO";
////         String f1="FERNANDEZ";
////         
////         String b1= a1.substring(0, 2);
////         String c1= f1.substring(0, 2);
//           
////                      int ale1=(int)(Math.random()*500+7); 
//                      
//                     
////         System.out.println(b+c+ale);
////         System.out.println(b1+c1+ale1);
//       
//     }
    
     
}
