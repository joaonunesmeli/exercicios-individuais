package bootcamp.java.mod5.desafio.savetheropa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private int nextID = 0;
    private Map<Integer, List<Vestuario>> guardaRoupas = new HashMap<>();

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario) {
        int id = this.nextID;
        this.guardaRoupas.put(id, listaDeVestuario);
        this.nextID++;
        return id;
    }

    public void mostrarVestuarios() {
        System.out.printf("%-5s | %-20s | %-20s\n", "#", "Marca", "Modelo");
        System.out.println("======|======================|======================");
        for (Map.Entry<Integer, List<Vestuario>> es : guardaRoupas.entrySet()) {
            for (Vestuario v : es.getValue()) {
                System.out.printf("%5d | %-20s | %-20s\n", es.getKey(), v.getMarca(), v.getModelo());
            }
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        return guardaRoupas.getOrDefault(id, null);
    }
}
