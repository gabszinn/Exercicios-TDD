package runner;

import org.junit.jupiter.api.Test;
import reserva.ReservaService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservaServiceTest {

    @Test
    void deveReservarQuandoCidadeForBeloHorizonte() {
        ReservaService service = new ReservaService();

        String resultado = service.reservar("Belo Horizonte", "Rua A, 100");

        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    void deveReservarQuandoCidadeForContagem() {
        ReservaService service = new ReservaService();

        String resultado = service.reservar("Contagem", "Avenida B, 200");

        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    void deveRetornarAreaForaDeCoberturaQuandoCidadeNaoForAtendida() {
        ReservaService service = new ReservaService();

        String resultado = service.reservar("São Paulo", "Avenida Paulista, 1000");

        assertEquals("Área fora de cobertura", resultado);
    }
}
