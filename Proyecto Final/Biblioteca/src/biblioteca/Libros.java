
package biblioteca;



/**
 *
 * @author Alumno
 */
public class Libros extends Items{
    //private String id_libro;
    private String editorial;
    private String noEdicion;
    private String categoria ;    
    private String pag;

      MetodosJ m1= new MetodosJ();
       
    
    Libros(String  id, String au, String nom, String lu, String an, String edi,String c, String ne,String pag){
        super(id,au,nom,lu,an );
        //this.id_libro=iL;
        this.editorial=edi;
        this.categoria=c;
        this.noEdicion=ne;
        this.pag=pag;
         
    }

   
    
    
    
     
    public void Agregar(){
        
        String a;
        String b;
        this.idItem=this.generarId();
        
       
       
      a="Insert INTO items (id_items, autor, nombre,lugarP, anioPublicacion, disponibilidad)" + " values('"+this.idItem+"' , '"+this.autor+"' , '"+this.nombre+"' , '"+this.lugarP+"' , '"+this.añoP+"' , "+"'SI')";
      b="Insert INTO libro (id_libro, editorial, no_edicion, pag, categoria)" + " values('"+this.idItem+"','"+this.editorial+"','"+this.noEdicion+"','"+this.pag+"','"+this.categoria+"')";
      
       m1.conectar().ejecutar(a);
       m1.conectar().ejecutar(b);

    //System.out.println(a);
    
     }
    
    
    
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNoEdicion() {
        return noEdicion;
    }

    public void setNoEdicion(String noEdicion) {
        this.noEdicion = noEdicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPag() {
        return pag;
    }

    public void setPag(String pag) {
        this.pag = pag;
    }
    
    
    
    
    
    
}
