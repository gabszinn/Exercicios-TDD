package reserva;

public class ReservaService {

    public String reservar(String cidade, String endereco) {
        if (cidade == null || cidade.isBlank()) {
            return "Área fora de cobertura";
        }

        if (cidade.equalsIgnoreCase("Belo Horizonte") || cidade.equalsIgnoreCase("Contagem")) {
            return "Motorista a caminho";
        }

        return "Área fora de cobertura";
    }
}
