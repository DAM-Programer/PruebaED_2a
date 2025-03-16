package instituto;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void testCompareTo() {
        // Arrange
        Persona persona1 = new Persona(12345678, "Ana García", 'F', 10, 5, 1995);
        Persona persona2 = new Persona(87654321, "Luis Martínez", 'M', 20, 10, 1985);

        // Act & Assert
        assertTrue(persona1.compareTo(persona2) < 0, "persona1 debería ser menor que persona2");
        assertTrue(persona2.compareTo(persona1) > 0, "persona2 debería ser mayor que persona1");
        assertEquals(0, persona1.compareTo(new Persona(12345678)), "Dos personas con el mismo NIF deberían ser iguales");
    }

    @Test
    void testEquals() {
        // Arrange
        Persona persona1 = new Persona(12345678, "Ana García", 'F', 10, 5, 1995);
        Persona persona2 = new Persona(12345678, "Ana García", 'F', 10, 5, 1995);
        Persona persona3 = new Persona(87654321, "Luis Martínez", 'M', 20, 10, 1985);

        // Act & Assert
        assertEquals(persona1, persona2, "Dos personas con el mismo NIF deberían ser iguales");
        assertNotEquals(persona1, persona3, "Dos personas con distinto NIF no deberían ser iguales");
    }
}

