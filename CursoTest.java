package instituto;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {
    @Test
    void testAniadirAlumno() {
        // Arrange
        Curso curso = new Curso("Historia");
        Persona alumno = new Persona(12345678, "Juan Pérez", 'M', 15, 8, 1990);

        // Act
        curso.aniadirAlumno(alumno);
    }
}
