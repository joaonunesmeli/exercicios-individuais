package bootcamp.java.mod5.aula5.tm.exerc5.sort;

public class Pessoa implements Precedente<Pessoa> {
    private String name;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean precedeA(Pessoa pessoa) {
        return cpf.compareTo(pessoa.cpf) < 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
