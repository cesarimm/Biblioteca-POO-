package biblioteca;

/**
 *
 * @author Alumno
 */
public abstract class  Items {
    
    protected   String  idItem;
     protected String autor;
     protected String nombre;
      protected String lugarP;
    protected String añoP;
  //  protected String estado;

   
   
   
   public Items(String id, String au, String nom, String lu, String an ){
       this.idItem=id;
       this.autor=au;
       this.nombre=nom;
       this.lugarP=lu;
       this.añoP=an;
       //this.estado=estado;
      
   }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarP() {
        return lugarP;
    }

    public void setLugarP(String lugarP) {
        this.lugarP = lugarP;
    }

    public String getAñoP() {
        return añoP;
    }

    public void setAñoP(String añoP) {
        this.añoP = añoP;
    }

//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }

    
    public String generarId(){
        String n, a,l;
        
        n=this.nombre.substring(0, 2);
        a=this.autor.substring(0, 2);
       return n+a+this.añoP;
       
       }
  
    
   
   
   
   
}
