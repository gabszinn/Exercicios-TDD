package desconto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraDescontoTest {

    @Test
    void deveRetornarMesmoValorQuandoCompraForMenorQueCem() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.calcularValorFinal(80.00);

        assertEquals(80.00, resultado, 0.001);
    }

    @Test
    void deveAplicarCincoPorCentoQuandoCompraForEntreCemEQuinhentos() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.calcularValorFinal(200.00);

        assertEquals(190.00, resultado, 0.001);
    }

    @Test
    void deveAplicarDezPorCentoQuandoCompraForMaiorOuIgualAQuinhentos() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.calcularValorFinal(1000.00);

        assertEquals(900.00, resultado, 0.001);
    }

    @Test
    void deveAplicarCincoPorCentoQuandoCompraForExatamenteCem() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.calcularValorFinal(100.00);

        assertEquals(95.00, resultado, 0.001);
    }

    @Test
    void deveAplicarCincoPorCentoQuandoCompraForQuatrocentosENoventaENoveENoventaENove() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.calcularValorFinal(499.99);

        assertEquals(474.9905, resultado, 0.001);
    }

    @Test
    void deveAplicarDezPorCentoQuandoCompraForExatamenteQuinhentos() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double resultado = calculadora.calcularValorFinal(500.00);

        assertEquals(450.00, resultado, 0.001);
    }

    @Test
    void deveLancarExcecaoQuandoValorDaCompraForNegativo() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.calcularValorFinal(-50.00)
        );
    }
}
