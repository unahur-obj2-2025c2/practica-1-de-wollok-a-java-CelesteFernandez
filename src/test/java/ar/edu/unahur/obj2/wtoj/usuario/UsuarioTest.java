package ar.edu.unahur.obj2.wtoj.usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.PlanBasico;

public class UsuarioTest {
    @Test
    void testSetContenidos() {
        Usuario usuario = new Usuario();
        Contenido contenido1 = new Contenido("Contenido 1", 10.0) {
            @Override
            protected Double doCosto() {
                return 10.0;
            }
        };
        Contenido contenido2 = new Contenido("Contenido 2", 20.0) {
            @Override
            protected Double doCosto() {
                return 20.0;
            }
        };

        usuario.setContenidos(List.of(contenido1, contenido2));

        assertEquals(2, usuario.getContenidos().size());
    }

    @Test
    void testConstructorUsuarioConPlanYContenidos() {
        Contenido contenido1 = new Contenido("Contenido 1", 10.0) {
            @Override
            protected Double doCosto() {
                return 10.0;
            }
        };
        Contenido contenido2 = new Contenido("Contenido 2", 20.0) {
            @Override
            protected Double doCosto() {
                return 20.0;
            }
        };
        List<Contenido> contenidos = List.of(contenido1, contenido2);
        PlanBasico planBasico = new PlanBasico(5, 15.0);
        Usuario usuario = new Usuario(planBasico, contenidos);

        assertEquals(planBasico, usuario.getPlan());
        assertEquals(2, usuario.getContenidos().size());
    }

    @Test
    void testConstructorUsuarioConContenidos() {
        Contenido contenido1 = new Contenido("Contenido 1", 10.0) {
            @Override
            protected Double doCosto() {
                return 10.0;
            }
        };
        Contenido contenido2 = new Contenido("Contenido 2", 20.0) {
            @Override
            protected Double doCosto() {
                return 20.0;
            }
        };
        List<Contenido> contenidos = List.of(contenido1, contenido2);
        Usuario usuario = new Usuario(contenidos);

        assertEquals(2, usuario.getContenidos().size());
    }
}
