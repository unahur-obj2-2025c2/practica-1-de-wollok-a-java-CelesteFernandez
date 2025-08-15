package ar.edu.unahur.obj2.wtoj.planes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanBasicoTest {
    @Test
    void testCostoPlanSinExcedentes() {
        Usuario usuario = new Usuario();
        PlanBasico planBasico = new PlanBasico(5,100.0);
        usuario.setPlan(planBasico);

        assertEquals(100.0, planBasico.costoPlan(usuario));
        assertEquals(100.0, usuario.getPlan().costoPlan(usuario));
    }

    @Test
    void testCostoPlanConExcedentes() {
        Usuario usuario = new Usuario();
        PlanBasico planBasico = new PlanBasico(2, 20.0);
        usuario.setPlan(planBasico);
        Contenido contenido1 = new Contenido("Contenido 1", 10.0) {
            @Override
            protected Double doCosto() {
                return 10.0;
            }
        };
        usuario.consumirContenido(contenido1);
        usuario.consumirContenido(contenido1);
        usuario.consumirContenido(contenido1);
        usuario.consumirContenido(contenido1);
        usuario.consumirContenido(contenido1);
        //costo = base + precio de cada excedente
        //costo = 20 + (3 * 10)
        assertEquals(50, usuario.getPlan().costoPlan(usuario));
    }
}
