package bootcamp.java.mod5.desafio.dakar;

public class SocorristaMoto extends Veiculo {
    public SocorristaMoto() {
        super(50, 10, 30, "SOCORRISTA Moto", 1500, 4);
    }

    public void socorrer(Moto moto) {
        System.out.println("Socorrendo moto " + moto.getPlaca());
    }
}
