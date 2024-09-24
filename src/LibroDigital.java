public class LibroDigital extends LibroImpreso{

    private String tamanioArchivo;

    public LibroDigital() {
    }

    public LibroDigital(String tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    public String getTamanioArchivo() {
        return tamanioArchivo;
    }

    public void setTamanioArchivo(String tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    @Override
    public String toString() {
        return "LibroDigital{" +
                "tamanioArchivo='" + tamanioArchivo + '\'' +
                '}';
    }

    @Override
    public void mostrarDetalles(){
        System.out.println(" Titulo: " + titulo + " Autor: " + autor + " Precio: " + precio );

    }
}
