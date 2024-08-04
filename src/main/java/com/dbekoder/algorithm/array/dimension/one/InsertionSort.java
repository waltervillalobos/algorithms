package com.dbekoder.algorithm.array.dimension.one;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSort {

    private static int[] execute(int[] array){

        for (int i = 1; i < array.length; i++) {

            int value = array[i];

            int j = i - 1;

            // iterates sub array[0,i] 
            while((j >= 0) && (value < array[j])) {

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = value;
        }

        return array;
    }


    public static void main(String[] args) {

        int[] numbers = {32, 42, 24, 12, 53, 28, 30, 5, 29};
        printArray("Numbers array", numbers);
        
        int[] sortedNumbers = execute(numbers);
        printArray("Sorted array", sortedNumbers);
    }

    private static void printArray(String title, int[] array) {

        String result = Arrays.stream(array)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" "));

        System.out.println(title);
        System.out.println(result);
    }
    

}
