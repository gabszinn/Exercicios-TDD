package desconto;

public class CalculadoraDesconto {

    private static final double VALOR_MINIMO_DESCONTO_CINCO_POR_CENTO = 100.00;
    private static final double VALOR_MINIMO_DESCONTO_DEZ_POR_CENTO = 500.00;

    private static final double DESCONTO_CINCO_POR_CENTO = 0.05;
    private static final double DESCONTO_DEZ_POR_CENTO = 0.10;

    public double calcularValorFinal(double valorCompra) {
        validarValorCompra(valorCompra);

        if (valorCompra >= VALOR_MINIMO_DESCONTO_DEZ_POR_CENTO) {
            return aplicarDesconto(valorCompra, DESCONTO_DEZ_POR_CENTO);
        }

        if (valorCompra >= VALOR_MINIMO_DESCONTO_CINCO_POR_CENTO) {
            return aplicarDesconto(valorCompra, DESCONTO_CINCO_POR_CENTO);
        }

        return valorCompra;
    }

    private void validarValorCompra(double valorCompra) {
        if (valorCompra < 0) {
            throw new IllegalArgumentException("O valor da compra não pode ser negativo.");
        }
    }

    private double aplicarDesconto(double valorCompra, double percentualDesconto) {
        return valorCompra - (valorCompra * percentualDesconto);
    }
}
