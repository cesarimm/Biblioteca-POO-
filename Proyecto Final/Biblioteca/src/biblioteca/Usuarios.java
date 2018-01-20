/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Alumno
 */
public abstract class Usuarios {
    
    protected  String Nombre;
    protected String Apaterno;
     protected String Amaterno;
      protected String Direccion;
       protected String Telefono;
        protected String  ID;
        
         public Usuarios(){
             
         }
        
        public Usuarios(String nombre, String pa, String ma, String Dire, String Tele, String id){
            
            
            this.Nombre=nombre;
            this.Amaterno=ma;
            this.Apaterno=pa;
            this.Direccion=Dire;
            this.Telefono=Tele;
            this.ID=id;
            
           }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
  
         public String generarId(){
        String n, a;
        
        n=this.Nombre.substring(0, 2);
        a=this.Apaterno.substring(0, 2);
        
        
       int ale=(int)(Math.random()*500+7);
        
       return n+a+ale;
       
       }
        
    
    
}
