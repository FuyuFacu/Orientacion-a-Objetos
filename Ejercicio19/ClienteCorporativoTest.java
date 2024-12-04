package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteCorporativoTest {
    private ClienteCorporativo clienteCorporativo;
    private EnvioLocal envioLocal;
    private EnvioInterurbano envioInterurbano;

    @BeforeEach
    void setUp() {
        // Inicialización antes de cada prueba
        clienteCorporativo = new ClienteCorporativo("Empresa X", "Calle Corporativa 456", 20);
        envioLocal = new EnvioLocal(LocalDate.now(), 1000, 1000, 500, false); // Entrega estándar
        envioInterurbano = new EnvioInterurbano(LocalDate.now(), 1000, 1500, 1000); // Distancia 500km
    }

    @Test
    void testCalcularMontoSinDescuento() {
        // Agregar envíos
        clienteCorporativo.agregarEnvio(envioLocal);
        clienteCorporativo.agregarEnvio(envioInterurbano);

        // Calcular monto y verificar
        double montoEsperado = envioLocal.montoPagar() + envioInterurbano.montoPagar();
        double montoCalculado = clienteCorporativo.calcularMonto();

        assertEquals(montoEsperado, montoCalculado);
    }

    @Test
    void testAgregarEnvio() {
        // Agregar un envío y verificar si fue añadido correctamente
        boolean agregado = clienteCorporativo.agregarEnvio(envioLocal);
        assertTrue(agregado);
        assertEquals(1, clienteCorporativo.getEnvios().size()); // Verificar que la lista tiene un elemento
    }
}
