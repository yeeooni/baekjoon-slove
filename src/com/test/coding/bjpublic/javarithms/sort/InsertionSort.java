package com.test.coding.bjpublic.javarithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 1, 6, 8, 7, 3 };
        System.out.println(Arrays.toString(insertionSort(arr, arr.length)));
    }
    static int[] insertionSort(int[] arr, int n){
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j;
            for(j = i - 1; j >= 0 && arr[j] > temp; j--){
                arr[j + 1] = arr[j];
            }
            System.out.println(j);
            arr[j + 1] = temp;
        }
        return arr;
    }

}
