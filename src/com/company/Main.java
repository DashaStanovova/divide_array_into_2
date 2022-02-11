package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
	    String[] array=scanner.nextLine().split(" ");
        int[] array1 = new int[array.length/2];
        int[] array2 = new int[array.length/2];
        int sum1=0;
        int sum2=0;
        int product1=1;
        int product2=1;
        for (int i = 0; i<array.length/2; i++){
            array1[i]=Integer.valueOf(array[i]);
            sum1=sum1+array1[i];
            product1=product1*array1[i];
        }
        for (int i = 0; i<array.length/2; i++){
            array2[i]=Integer.valueOf(array[i+array.length/2]);
            sum2=sum2+array2[i];
            product2=product2*array2[i];
        }
        System.out.println("Sum of the first sub-array is "+sum1);
        System.out.println("Product of the first sub-array is "+product1);
        System.out.println("Sum of the second sub-array is "+sum2);
        System.out.println("Product of the second sub-array is "+product2);
    }
}
