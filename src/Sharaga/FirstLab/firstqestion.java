package src.cooledge.ablamsk.FirstLaba;

import java.util.Arrays;

public class firstqestion {

    public static void main(String[] args) {

        int test=2;
        int n = 500;
        int[] array = new int[501];
        for(int k=2;k<array.length;k++){
            array[k]=test;
            test++;

        }

        boolean[] primes = new boolean[n + 1];

        Arrays.fill(primes, true);

        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;


                }
                }
           if(array[i]>100&&primes[i]){

                System.out.println(array[i]);
            }
           // System.out.println(primes[i]+"   Простые  "+massiv[i]);
        }

    }
}

