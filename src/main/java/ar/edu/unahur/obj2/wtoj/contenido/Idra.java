package ar.edu.unahur.obj2.wtoj.contenido;

public class Idra {
    private static Idra instance = new Idra();
    private Idra() {
        // no le pongo nada adentro, entonces no es instanciable y así anulo el constructor cuando es un singleton
    }
    private Double valor = 0.5;

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public static Idra getInstance() {
        return instance; //recupera la única instancia generada de Idra
    }
    
}
