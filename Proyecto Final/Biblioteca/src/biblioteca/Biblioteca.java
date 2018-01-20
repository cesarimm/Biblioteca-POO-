/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Biblioteca {
  private String nombre;
  private String direccion ;
  private String encargado;
  private String telefono;
  MetodosJ m1= new MetodosJ();
  /// Listas quue se generan recordar union  con la bases de datos al final terminaran siendo tablas en nuestra base de datos

    
   public Biblioteca() {
        
    }
  
  public Biblioteca(String nombre, String direccion, String encargado, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.encargado = encargado;
        this.telefono = telefono;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
public void Agregar() {
        m1.conectar();
        String a;

      a="Insert INTO biblioteca (nombre, encargado, direccion, telefono)" + " values('"+this.nombre+"' , '"+this.encargado+"','"+this.direccion+"' , '"+this.telefono+"')";
     
       m1.conectar().ejecutar(a);
      


    
    
}

  
  
  
    
}
