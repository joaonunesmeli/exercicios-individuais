package bootcamp.java.mod5.desafio.dakar;

public class SocorristaCarro extends Veiculo {
    public SocorristaCarro() {
        super(10, 10, 30, "SOCORRISTA Carro", 1500, 4);
    }

    public void socorrer(Carro carro) {
        System.out.println("Socorrendo carro " + carro.getPlaca());
    }
}
