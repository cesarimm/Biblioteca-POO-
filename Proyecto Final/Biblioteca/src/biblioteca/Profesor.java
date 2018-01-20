/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cat Plata
 */
public class Profesor extends Usuarios{
    
    
    
   private String Clave;
   private String Academia;
 MetodosJ m1= new MetodosJ();
     
    
    public Profesor(String nombre, String pa, String ma, String Dire, String Tele, String id, String cla, String acade) {
         super(nombre, pa, ma, Dire, Tele, id);
         this.Clave=cla;
         this.Academia=acade;
    }
    
    
    
 public void Agregar(){
        
        String a;
        String b;
        this.ID=this.generarId();
       
      a="Insert INTO usuarios (id_usuario, nombre, apellidoP,apellidoM, direccion, telefono)" + " values('"+this.ID+"' , '"+this.Nombre+"' , '"+this.Apaterno+"' , '"+this.Amaterno+"' , '"+this.Direccion+"' , '"+this.Telefono+"')";
      b="Insert INTO profesor (id_profesor, clave, academia)" + " values('"+this.ID+"' , '"+this.Clave+"' , '"+this.Academia+"')";
      
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);

//System.out.println(b);

    }
     

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getAcademia() {
        return Academia;
    }

    public void setAcademia(String Academia) {
        this.Academia = Academia;
    }
    
    
    
    
    
}
