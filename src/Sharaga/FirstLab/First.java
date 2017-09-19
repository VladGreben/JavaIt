package Sharaga.FirstLab;

import java.util.Random;

public class First {

    private static int max;
    private static int min;



    static int max(int[] array){
        int max = 0;
        for (int i = 0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    static int min(int[] array){
        for (int i = 0;i<array.length;i++){
            if (min > array[i]) {
                min = array[i];
            }
            if (min == 0){
                min=array[i];
            }
        }
        return min;

    }


    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];
        int[] array4 = new int[5];
        int[] array = new int[5];


        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100) + 1;
            System.out.println(array1[i]);

        }for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100) + 1;
            //System.out.println(array2[i]);

        }for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(100) + 1;
            //System.out.println(array3[i]);

        }for (int i = 0; i < array4.length; i++) {
            array4[i] = random.nextInt(100) + 1;
           //System.out.println(array4[i]);
        }
        array = array1;



        System.out.println(min(array)+" min "+max(array)+" min");



    }
}
