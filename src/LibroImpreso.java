public class LibroImpreso extends Libro {

    private int peso;

    public LibroImpreso() {
    }

    public LibroImpreso(String titulo, String autor, int peso) {
        super(titulo,autor,peso);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "LibroImpreso{" +
                "peso=" + peso +
                '}';
    }

    @Override
    public void mostrarDetalles(){
        System.out.println(" Titulo: " + titulo + " Autor: " + autor + " Precio: " + precio );

    }
}



