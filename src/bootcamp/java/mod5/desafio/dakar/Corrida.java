package bootcamp.java.mod5.desafio.dakar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Corrida {
    private String nome;
    private double distancia;
    private double premioEmDolares;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos = new ArrayList<>();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();
    private SocorristaCarro socorristaCarro = new SocorristaCarro();

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) throws Exception {
        if (this.listaVeiculos.size() == this.quantidadeVeiculosPermitidos) {
            throw new Exception("Perdeu a vaga, jovem gafanhoto");
        }
        this.listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa) throws Exception {
        if (this.listaVeiculos.size() == this.quantidadeVeiculosPermitidos) {
            throw new Exception("Perdeu a vaga, jovem gafanhoto");
        }
        this.listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        this.listaVeiculos.removeIf(v -> v.getPlaca() == placa);
    }

    public void socorrerCarro(String placa) {
        Optional<Veiculo> v = this.listaVeiculos.stream().filter(h -> h.getPlaca() == placa).findAny();
        if (v.isPresent()) {
            this.socorristaCarro.socorrer((Carro) v.get());
        }
    }

    public void socorrerMoto(String placa) {
        Optional<Veiculo> v = this.listaVeiculos.stream().filter(h -> h.getPlaca() == placa).findAny();
        if (v.isPresent()) {
            this.socorristaMoto.socorrer((Moto) v.get());
        }
    }
}
