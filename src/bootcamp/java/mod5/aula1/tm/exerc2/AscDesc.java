package bootcamp.java.mod5.aula1.tm.exerc2;

import java.util.Arrays;

public class AscDesc {
    public static void main(String[] args) {
        int arr[] = { 52, 10, 85, 1324, 01, 13, 62, 30, 12, 127 };

        Arrays.sort(arr);
        printArray(arr, true);
        printArray(arr, false);
    }

    public static void printArray(int arr[], boolean asc) {
        int sign = asc ? 1 : -1;
        int p = asc ? 0 : 1;

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[(arr.length - 1) * p + sign * i]);
        }
        System.out.println("]");
    }
}
