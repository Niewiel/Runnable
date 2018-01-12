package pl.niewiel;

import java.util.Arrays;

public class MinSearcher implements Runnable {
    private int[] A, B, C, D;

    MinSearcher(int[] a, int[] b, int[] c, int[] d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    @Override
    public void run() {
        sortuj(A);
        sortuj(B);
        sortuj(C);
        sortuj(D);
        System.out.println("tablica A: " + A[0]);
        System.out.println("tablica B: " + B[0]);
        System.out.println("tablica C: " + C[0]);
        System.out.println("tablica D: " + D[0]);
    }

    void sortuj(int[] arr) {
        Arrays.sort(arr);
    }


}
