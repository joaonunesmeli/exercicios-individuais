package bootcamp.java.mod5.aula5.tm.exerc5.sort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Precedente<Pessoa>> pessoas = Arrays.asList(
                new Pessoa("AAAA", "9999"),
                new Pessoa("BBBB", "7777"),
                new Pessoa("CCCC", "8888")
        );

        for (Precedente<Pessoa> p : pessoas) {
            System.out.println(p);
        }
        System.out.println("\n");
        SortUtil.sort(pessoas);
        for (Precedente<Pessoa> p : pessoas) {
            System.out.println(p);
        }

        System.out.println("\n=====================\n");

        List<Precedente<Celular>> celulares = Arrays.asList(
                new Celular("3333", "AAAA"),
                new Celular("1111", "BBBB"),
                new Celular("2222", "CCCC")
        );

        for (Precedente<Celular> c : celulares) {
            System.out.println(c);
        }
        System.out.println("\n");
        SortUtil.sort(celulares);
        for (Precedente<Celular> c : celulares) {
            System.out.println(c);
        }
    }
}
