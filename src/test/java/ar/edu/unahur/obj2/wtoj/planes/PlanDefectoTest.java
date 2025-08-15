package ar.edu.unahur.obj2.wtoj.planes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanDefectoTest {
    @Test
    void testCostoPlan() {
        Usuario usuario = new Usuario();

        assertEquals(usuario.getPlan().costoPlan(usuario),0.0);
    }
}
