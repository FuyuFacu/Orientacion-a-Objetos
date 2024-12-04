package ar.edu.unlp.info.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {
    private Propiedad propiedad;
    private DateLapse reserva1;
    private DateLapse reserva2;
    private DateLapse reservaEnCurso;

    @BeforeEach
    void setUp() {
        // Crear una propiedad con precio por noche
        propiedad = new Propiedad("Calle Falsa 123", "Casa en el centro", 100);

        // Crear períodos de reserva
        reserva1 = new DateLapse(LocalDate.of(2024, 12, 10), LocalDate.of(2024, 12, 15)); // Futuro
        reserva2 = new DateLapse(LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 25)); // Futuro
        reservaEnCurso = new DateLapse(LocalDate.now().minusDays(2), LocalDate.now().plusDays(3)); // En curso

        // Agregar reservas a la propiedad
        propiedad.agregarReserva(reserva1);
        propiedad.agregarReserva(reserva2);
        propiedad.agregarReserva(reservaEnCurso);
    }

    @Test
    void testCancelarReservaFutura() {
        // Cancelar una reserva futura
        boolean resultado = propiedad.removerPeriodo(reserva1);

        // Verificar que la reserva fue eliminada
        assertTrue(resultado);
        assertFalse(propiedad.getReservas().contains(reserva1));
    }

    @Test
    void testCancelarReservaEnCurso() {
        // Intentando cancelar una reserva en curso
        boolean resultado = propiedad.removerPeriodo(reservaEnCurso);

        // Verificar que la reserva no fue eliminada
        assertFalse(resultado);
        assertTrue(propiedad.getReservas().contains(reservaEnCurso));
    }

    @Test
    void testPropiedadCancelarReserva() {
        // Cancelar una reserva futura
        propiedad.removerPeriodo(reserva2);

        // Crear un nuevo período que coincida con la reserva cancelada
        DateLapse nuevaReserva = new DateLapse(LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 25));

        // Verificar que la propiedad este disponible para el período cancelado
        assertTrue(propiedad.revisarDisponibilidad(nuevaReserva));
    }
}

