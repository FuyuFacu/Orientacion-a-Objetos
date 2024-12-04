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
        // Crear una propiedad con precio por noche y política de cancelación flexible
        propiedad = new Propiedad("Calle Falsa 123", "Casa en el centro", 100, new CancelacionFlexible());

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
    void testReembolsoPoliticaFlexible() {
        // Verificar el reembolso para una reserva futura con política flexible
        double reembolso = propiedad.getPoliticaReembolso().calcularReembolso(reserva1, LocalDate.of(2024, 12, 5), propiedad.getPrecioNoche());

        // Verificar que el reembolso sea el monto completo de la reserva
        assertEquals(reserva1.getDays() * propiedad.getPrecioNoche(), reembolso);
    }

    @Test
    void testReembolsoPoliticaModerada() {
        // Cambiar la política a moderada
        propiedad.setPoliticaReembolso(new CancelacionModerada());

        // Verificar el reembolso para una reserva futura con política moderada
        double reembolso = propiedad.getPoliticaReembolso().calcularReembolso(reserva1, LocalDate.of(2024, 12, 5), propiedad.getPrecioNoche());

        // Verificar que el reembolso sea el monto completo (ya que la cancelación es 5 días antes)
        assertEquals(reserva1.getDays() * propiedad.getPrecioNoche(), reembolso);
    }

    @Test
    void testReembolsoPoliticaEstricta() {
        // Cambiar la política a estricta
        propiedad.setPoliticaReembolso(new CancelacionEstricta());

        // Verificar que el reembolso sea 0 para una política estricta
        double reembolso = propiedad.getPoliticaReembolso().calcularReembolso(reserva1, LocalDate.of(2024, 12, 5), propiedad.getPrecioNoche());
        assertEquals(0, reembolso);
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
