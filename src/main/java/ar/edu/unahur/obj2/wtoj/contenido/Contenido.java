package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    private String titulo;
    private Double costoBase;
    //hay atributos privados y publicos

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this. costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double costo() {
        return this.costoBase + this.doCosto();
    }

    protected abstract Double doCosto();
}