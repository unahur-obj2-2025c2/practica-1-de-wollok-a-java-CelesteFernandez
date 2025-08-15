package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public interface PlanSuscribible { //las interfaces no tienen atributos, pero sí métodos
    Double costoPlan(Usuario usuario);
}
