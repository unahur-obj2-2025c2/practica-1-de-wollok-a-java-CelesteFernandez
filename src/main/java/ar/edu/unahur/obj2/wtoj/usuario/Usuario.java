package ar.edu.unahur.obj2.wtoj.usuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.PlanDefecto;
import ar.edu.unahur.obj2.wtoj.planes.PlanSuscribible;

public class Usuario {
    private PlanSuscribible plan = new PlanDefecto();
    private List<Contenido> contenidos = new ArrayList<>();
    
    public Usuario(PlanSuscribible plan, List<Contenido> contenidos) {
        this.plan = plan;
        this.contenidos = contenidos;
    }

    public Usuario() {
    }

    public Usuario(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public PlanSuscribible getPlan() {
        return plan;
    }

    public void setPlan(PlanSuscribible plan) {
        this.plan = plan;
    }
    
    public void consumirContenido(Contenido contenido) {
        contenidos.add(contenido);
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }
}
