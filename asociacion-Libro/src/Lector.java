public class Lector {
    private String cedula,nombre;
    private Libro libroActual;
    public Lector(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public Libro getLibroActual() {
        return libroActual;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void tomarPrestado(Libro libro){
        if (libroActual != null){
        System.out.println(nombre + " ya tiene el libro \n" + libroActual.getTitulo());
    } else {
        if (libro.prestar()){
            libroActual = libro;
        }
    }
    }
    public void devolverLibro(Libro libro){
        if(libroActual == null){
            System.out.println(nombre + " no tiene libro\n");
        }else if(libroActual != libro){
            System.out.println("lector: \n"+nombre+"\nno se entrego pues el libro no es\n" + libroActual.getTitulo()+"\n");
        }else{
            libro.devolver();
            libroActual = null;
        }
    }
    public void mostrarEstado(){
        String estado = (libroActual!=null) ? libroActual.getTitulo() : "sin titulo";
        System.out.println("Lector: " + nombre + " \nLibro: " + estado);
    }
}