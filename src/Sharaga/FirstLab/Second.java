package Sharaga.FirstLab;

import java.util.Random;

public class Second {
    public static void main(String[] args) {


        int max = 0;
        int min=0;

        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.println(array[i]);

            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            if (min == 0){
                min=array[i];
            }
        }
        System.out.println(max + " max");
        System.out.println(min + " min");
    }
}
