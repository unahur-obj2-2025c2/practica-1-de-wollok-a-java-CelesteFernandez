package ar.edu.unahur.obj2.wtoj.planes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanPremiumTest {
    @Test
    void testCostoPlan() {
        Usuario usuario = new Usuario();
        PlanSuscribible planP = new PlanPremium(12.0);
        usuario.setPlan(planP);
        assertEquals(12.0, planP.costoPlan(usuario));
    }
}
