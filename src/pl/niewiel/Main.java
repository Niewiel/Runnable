package pl.niewiel;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {
        int[] A = new int[50];
        int[] B = new int[50];
        int[] C = new int[50];
        int[] D = new int[50];

        Random liczba = new Random();

        for (int i = 0; i < 50; i++) {
            A[i] = liczba.nextInt(600);
            B[i] = liczba.nextInt(600);
            C[i] = liczba.nextInt(600);
            D[i] = liczba.nextInt(600);

        }

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(new MinSearcher(A, B, C, D));
        pool.shutdown();
    }

}
