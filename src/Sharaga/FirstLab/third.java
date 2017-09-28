package Sharaga.FirstLab;

import java.util.Random;

public class third {
    public static void main(String[] args) {


        int max = 0;
        int min=0;

        int imax=0;
        int  imin=0;
        
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.println(array[i]);

            if (max < array[i]) {
                max = array[i];
                imax=i;

            }
            if (min > array[i]) {
                min = array[i];
                imin=i;
            }
            if (min == 0){
                min=array[i];
            }
        }
        System.out.println(max + " max  index  "+imax);
        System.out.println(min + " min   index  "+imin);
    }
}
