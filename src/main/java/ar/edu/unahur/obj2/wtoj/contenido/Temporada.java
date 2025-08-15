package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private final Integer numero;  //final es cuando no cambia, es una constante
    private List<Episodio> episodios = new ArrayList<>();

    public Temporada(Integer numero, List<Episodio> episodios) { //constructor con todo
        this.numero = numero;
        this.episodios = episodios;
    }

    public Temporada(Integer numero) { //constructor con numero solo, lo puedo hacer solo porque ya tengo inicializado con una lista vacia episodios
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void agregarEpisodio(Episodio unEpisodio) { //void cuando no devuelve nada
        episodios.add(unEpisodio);
    }

    public Double costo() { //stream convierte la lista en un flujo de datos
        return episodios.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0); //mapToDouble porque le tengo que decir a qué tipo mapea
    }

    
}
