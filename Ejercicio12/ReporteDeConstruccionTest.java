package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
    private ReporteDeConstruccion reporte;
    private Cilindro cilindro;
    private Esfera esfera;
    private PrismaRectangular prisma;

    @BeforeEach
    public void setUp() {
        // Inicializa el reporte y algunas piezas de ejemplo antes de cada test
        reporte = new ReporteDeConstruccion();
        
        // Agrega algunas piezas con valores conocidos
        cilindro = new Cilindro("Hierro", "Rojo", 2, 5); // radio 2, altura 5
        esfera = new Esfera("Hierro", "Azul", 3); // radio 3
        prisma = new PrismaRectangular("Plástico", "Rojo", 2, 3, 4); // lados 2, 3 y altura 4

        reporte.agregarPieza(cilindro);
        reporte.agregarPieza(esfera);
        reporte.agregarPieza(prisma);
    }

    @Test
    public void testVolumenDeMaterial() {
        // Calcula el volumen de las piezas que contienen el nombre "Hierro" en el reporte
        double volumenHierro = reporte.volumenDeMaterial("Hierro");

        // Calcular volumen esperado
        double volumenCilindro = Math.PI * Math.pow(2, 2) * 5;
        double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(3, 3);

        assertEquals(volumenCilindro + volumenEsfera, volumenHierro, 0.01);
    }

    @Test
    public void testSuperficieDeColor() {
        // Calcula la superficie de las piezas del color "Rojo"
        double superficieRojo = reporte.superficieDeColor("Rojo");

        // Calcula la superficie de manera manual putamadre muchos numeros kjjj
        double superficieCilindro = (2 * Math.PI * 2 * 5) + (2 * Math.PI * Math.pow(2, 2));
        double superficiePrisma = 2 * ((2 * 3) + (2 * 4) + (3 * 4));

        assertEquals(superficieCilindro + superficiePrisma, superficieRojo, 0.01);
    }

    @Test
    public void testAgregarPieza() {
        // Verificar que la pieza se agregó correctamente
        assertEquals(3, reporte.getListaPiezas().size());

        // Agregar una nueva pieza y este mismo verifica el tamaño
        Esfera nuevaEsfera = new Esfera("Madera", "Verde", 1);
        reporte.agregarPieza(nuevaEsfera);
        assertEquals(4, reporte.getListaPiezas().size());
    }
}