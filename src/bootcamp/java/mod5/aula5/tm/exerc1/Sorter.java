package bootcamp.java.mod5.aula5.tm.exerc1;

import java.util.Comparator;

public interface Sorter<T> {
    void sort(T arr[], Comparator<T> comparator);
}
