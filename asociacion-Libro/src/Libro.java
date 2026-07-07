public class Libro {
    private String titulo,autor;
    private boolean disponible;

    public Libro(){
        this.disponible= true;
    }
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    public Libro(String titulo, String autor,boolean Disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible= Disponible;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public boolean isDisponible(){
        return this.disponible;
    }


    public void setTitulo(String Titulo){
        if(Titulo != null && !Titulo.isEmpty()){
            this.titulo = Titulo;
        }else{
            System.out.println("el titulo esta vacio");
        }
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setDisponible(boolean Disponible){
        this.disponible = Disponible;
    }
    public void mostrarInfo(){
        System.out.println("titulo es :"+this.titulo+"\nautor: "+this.autor +"\ndisponible: ");
        System.out.println( disponible ? "si": "no");
    }
    public boolean prestar(){
        if(disponible){
            disponible = false;
            System.out.println("el libro\n"+this.titulo+"\nfue prestado");
            return true;
        }else{
            System.out.println("el libro\n"+this.titulo+"\nya esta prestado");
            return false;
        }
    }
    public void devolver(){
        disponible = true;
        System.out.println("el libro\n"+this.titulo+"\nfue devuelto\n");
    }
}

