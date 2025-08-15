package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental extends Contenido{
    private String director;

    public Documental(String titulo, Double costoBase, String director) {
        super(titulo, costoBase);  //primero van los atributos que hereda
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    protected Double doCosto() {
        return Idra.getInstance().getValor(); 
    }
}
