/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Cat Plata
 */
public  class Prestamos {
    
    //ATRIBUTOS
    
    public String fechaPrestamo;
    public String fechaEntrega;
    public Items items;
    public Usuarios usuarios;
    public String Prestamo;
    public String estado;
    public  Items IDitems;
    public String idItems;
    public String idUsers;
    
    MetodosJ m= new MetodosJ();
  
    
    
    //CONSTRUCTORES
    
   
    public Prestamos(){
        
       
        
    }    
    
    
    public Prestamos(  Items i, Usuarios u, String e)
    {
        
       
        
        this.items=i;
        
        this.usuarios=u;
        this.estado=e;
        Cfecha();
         FDentrega();
    }
    
    private void Cfecha(){
        
       
        Date Actual = new Date();
        
        
        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
     
        this.fechaPrestamo=formato.format(Actual);
        
        
        
      }
    
    private void FDentrega(){
        
        int dia, mes, anio;
        int a=5;
        int x=0;
        
      Calendar c1 =  Calendar.getInstance(); 

   dia=c1.get(Calendar.DATE);
   mes=c1.get(Calendar.MONTH)+1;
   anio= c1.get(Calendar.YEAR);  
        
   int o=anio%4;
   
   do{
  
    if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
        
        if(a+dia<32){
            
            dia=dia+a;
            a=0;
            
        }else{
            
            x=32-dia;
            dia=1;
            mes=mes+1;
            a=a-x;
            dia=dia+a;
            a=0;
            x=0;
            
        }
        
    }else if(mes==4||mes==6||mes==9||mes==11){
        
             if(dia+a<31){
                dia=dia+a;
                a=0;
            }else{
            x=31-dia;
            dia=1;
            mes=mes+1;
            a=a-x;
            dia=dia+a;
            a=0;
            x=0;
            }
        
        
    }else{
        
        if(mes==2&&o==0){
            
             if(dia+a<30){
                dia=dia+a;
                a=0;
            }else{
            x=30-dia;
            dia=1;
            mes=mes+1;
            a=a-x;
            dia=dia+a;
            a=0;
            x=0;
                     }
            
        }else{
            
             if(dia+a<29){
                dia=dia+a;
                a=0;
            }else{
            x=29-dia;
            dia=1;
            mes=mes+1;
            a=a-x;
             dia=dia+a;
            a=0;
            x=0;
           
                }
            
        }
        
        
    }
    }while(a!=0);
   
   
   
   this.fechaEntrega=dia+"-"+mes+"-"+anio;
   
   
   
    }
    

    
    
    public String getPrestamo() {
        return Prestamo;
    }

    public void setPrestamo(String Prestamo) {
        this.Prestamo = Prestamo;
    }

    public String getEstado() {
        return estado;
    }

    //SETTERS Y GETTERS
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    //MÉTODOS
    
    
    public boolean DisponibilidadItem()
    {
        
      
      if(m.BuscarDisponibilidad(this.idItems)==true) {
          
          return true;
      } else{
          return false;
      }
    
        
    }
           
        
          
    
    
    
    public boolean  existenciaLibro()
    {
    
       if(m.BuscarItems(this.idItems)==true){
           return true;
       }else{
           return false;
       }
            }
    
    
    
    public boolean existenciaUsuario(){
        
      
        if(m.BuscarUsuarios(this.idUsers)==true){
           return true;
       }else{
           return false;
       }
            }
        
        
    
    
    
     
    
    public boolean RealizarPrestamo(){

if(existenciaUsuario()==true&&existenciaLibro()==true&&DisponibilidadItem()==true){
    return true;
}else{
    return false;
}

}
  
      public String generarId(){
        String n, a;
        
        n=this.fechaPrestamo.substring(0, 2);
        a=this.idItems.substring(0, 2);
       return n+a;
       
       }
      
      
   
    

    public void Agregar(){
         String a;
        String b;
         Cfecha();
        FDentrega();
        this.Prestamo=this.generarId();
        
    if (RealizarPrestamo()==true)  {
        a="Insert INTO prestamo (id_prestamo, fechaP,fk_id_usuario )" + " values('"+this.Prestamo+"' , '"+this.fechaPrestamo+"' , '"+this.idUsers+"')";
        b="Insert INTO prestamo_items (fk_prestamo, fk_item, fechaE )" + " values('"+this.Prestamo+"','"+this.idItems+"','"+this.fechaEntrega+"')";
        
        
        //System.out.println(a);
          m.conectar().ejecutar(a);
       m.conectar().ejecutar(b);
       
       
   }
   else {
        
     JOptionPane.showMessageDialog(null, "No se puede realizar el Prestamo");
     
   }
  
   // System.out.println(a);
}
    

  public static void main (String args[]) throws SQLException{
      
       Prestamos P1 = new Prestamos();
       
       P1.idUsers= 	"PaPe461";
       P1.idItems= "ElLa1987";
       
       P1.Agregar();
       
//      if( P1.RealizarPrestamo()==true){
//          System.out.println("Diponoble");
//      }else{
//          System.out.println("No Diponoble");
//      }
       
      //System.out.println(P1.RealizarPrestamo());
       
   }
    

}
   