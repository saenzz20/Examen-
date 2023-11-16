package dominio;

public class Propiedades {
    //Atributos    
    private int id;
    private String nombre;
    private String direccion;
    private String estado;
    private String precioalquiler;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrecioalquiler() {
        return precioalquiler;
    }

    public void setPrecioalquiler(String precioalquiler) {
        this.precioalquiler = precioalquiler;
    }
    

    public Propiedades() {
    }

    public Propiedades(int id, String nombre, String direccion, String estado, String precioalquiler) {
        this.id = id;
        this.nombre = nombre;
        this.direccion= direccion;
        this.estado= estado;
        this.precioalquiler=precioalquiler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
}
