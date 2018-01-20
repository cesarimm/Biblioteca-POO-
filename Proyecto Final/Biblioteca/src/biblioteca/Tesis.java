package biblioteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class Tesis extends Items {
  
    private String tema;
    private String institucion;
    private String categoria;
    private String asesor1;
    private String asesor2;

      MetodosJ m1= new MetodosJ();
  
    

    
    
    public Tesis(String id, String au, String nom, String lu, String an, String te,String ins, String cat, String a1,String a2){
        super(id, au, nom, lu, an);
        
        this.tema= te;
        this.institucion= ins;
        this.categoria=cat;
        this.asesor1=a1;
        this.asesor2=a2;
        
    }
    
   public void Agregar(){
        
        String a;
        String b;
        this.idItem=this.generarId();
       
      a="Insert INTO items (id_items, autor, nombre,lugarP, anioPublicacion, disponibilidad)" + " values('"+this.idItem+"' , '"+this.autor+"' , '"+this.nombre+"' , '"+this.lugarP+"' , '"+this.añoP+"' , "+"'SI')";
      b="Insert INTO tesis (id_tesis, tema, institucion, categoria, asesor1, asesor2)" + " values('"+this.idItem+"','"+this.tema+"','"+this.institucion+"','"+this.categoria+"','"+this.asesor1+"','"+this.asesor2+"')";
      
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);

    
     }
    
    
    
    
    
    
    
    
    

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
