package bootcamp.java.mod5.desafio.savetheropa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        GuardaRoupa gr = new GuardaRoupa();
        List<Integer> ids = new ArrayList<>();

        List<Vestuario> vs = Arrays.asList(
                new Vestuario("Marca legal", "Camisa"),
                new Vestuario("Marca legal", "Calça"),
                new Vestuario("Marca legal", "Tênis")
        );
        ids.add(gr.guardarVestuario(vs));

        vs = Arrays.asList(
                new Vestuario("Marca ruim", "Camisa"),
                new Vestuario("Marca ruim", "Calça"),
                new Vestuario("Marca ruim", "Tênis")
        );
        ids.add(gr.guardarVestuario(vs));

        vs = Arrays.asList(
                new Vestuario("Marca marromeno", "Camisa"),
                new Vestuario("Marca marromeno", "Calça"),
                new Vestuario("Marca marromeno", "Tênis")
        );
        ids.add(gr.guardarVestuario(vs));

        gr.mostrarVestuarios();

        System.out.println("\n");
        for (Integer id : ids) {
            for (Vestuario v : gr.devolverVestuarios(id)) {
                System.out.println(v);
            }
        }
    }
}
