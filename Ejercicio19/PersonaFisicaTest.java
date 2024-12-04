package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaFisicaTest {
    private PersonaFisica personaFisica;
    private EnvioLocal envioLocal;
    private EnvioInterurbano envioInterurbano;

    @BeforeEach
    void setUp() {
        // Inicialización antes de cada prueba
        personaFisica = new PersonaFisica("Juan Pérez", "Calle random 123", 12345678);
        envioLocal = new EnvioLocal(LocalDate.now(), 1000, 1000, 500, false); // Entrega estándar
        envioInterurbano = new EnvioInterurbano(LocalDate.now(), 1000, 1500, 1000); // Distancia 500km
    }

    @Test
    void testCalcularMontoConDescuento() {
        // Agregar envíos
        personaFisica.agregarEnvio(envioLocal);
        personaFisica.agregarEnvio(envioInterurbano);

        // Calcular monto y verificar descuento
        double montoEsperado = envioLocal.montoPagar() + envioInterurbano.montoPagar();
        double montoCalculado = personaFisica.calcularMonto();

        assertEquals(montoEsperado * 0.9, montoCalculado);
    }

    @Test
    void testAgregarEnvio() {
        // Agregar un envío y verificar si fue añadido correctamente
        boolean agregado = personaFisica.agregarEnvio(envioLocal);
        assertTrue(agregado);
        assertEquals(1, personaFisica.getEnvios().size()); // Verificar que la lista tiene un elemento
    }
}
