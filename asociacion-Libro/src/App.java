public class App {
    public static void main(String[] args) throws Exception {
        //Libros
        Libro libro1 = new Libro("cien años de soledad","Gabriel Garcia Marquez");
        Libro libro2 = new Libro("Sin opciones","James Rodrigez");
        Libro libro3 = new Libro("patito","pato");
        Libro libro4 = new Libro("Lirios","flor");
        Libro libro5 = new Libro("Platonico","plato");
        //Lectores
        Lector lector1 = new Lector("1140919589","Yhirlan");
        Lector lector2 = new Lector("818165134","pablito");
        Lector lector3 = new Lector("1512423","pepito");
        Lector lector4 = new Lector("4454545256","francisco");
        Lector lector5 = new Lector("6875114213","Richad");

        lector1.tomarPrestado(libro1);
        lector1.mostrarEstado();
        System.out.println();
        lector2.tomarPrestado(libro1);
        lector2.mostrarEstado();
        System.out.println();
        lector3.tomarPrestado(libro2);
        lector3.mostrarEstado();
        System.out.println();
        lector4.tomarPrestado(libro3);
        lector4.mostrarEstado();
        System.out.println();
        lector5.tomarPrestado(libro4);
        lector5.mostrarEstado();
        System.out.println();
        lector2.tomarPrestado(libro5);
        lector2.mostrarEstado();

        //devolver
        System.out.println();
        lector1.devolverLibro(libro2);
        lector2.devolverLibro(libro5);
        lector3.devolverLibro(libro2);
        lector4.devolverLibro(libro3);
        lector5.devolverLibro(libro4);

    }
}
