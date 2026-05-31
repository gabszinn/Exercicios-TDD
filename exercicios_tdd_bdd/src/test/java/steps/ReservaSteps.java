package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import reserva.ReservaService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaSteps {

    private final ReservaService reservaService = new ReservaService();

    private String cidade;
    private String endereco;
    private String resultado;

    @Dado("que o passageiro está na cidade {string}")
    public void queOPassageiroEstaNaCidade(String cidade) {
        this.cidade = cidade;
    }

    @Dado("informou o endereço {string}")
    public void informouOEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Quando("solicitar a reserva do carro")
    public void solicitarAReservaDoCarro() {
        resultado = reservaService.reservar(cidade, endereco);
    }

    @Entao("o sistema deve retornar {string}")
    public void oSistemaDeveRetornar(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}
