package bootcamp.java.mod5.aula5.tm.exerc5.sort;

import java.util.List;

public final class SortUtil {
    private SortUtil() {
    }

    public static <T> void sort(List<Precedente<T>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                Precedente<T> a = arr.get(i);
                Precedente<T> b = arr.get(j);
                if (b.precedeA((T) a)) {
                    arr.set(i, b);
                    arr.set(j, a);
                }
            }
        }
    }
}
