package com.test.coding.bjpublic.javarithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 7, 9, 3, 5, 6, 8, 10};
        bubbleSort(arr, arr.length);
    }
    static void bubbleSort(int[] arr, int n){
        // 1 ~ n
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                swap(arr, j, j+1);
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int f, int s){
        if(arr[f] > arr[s]){
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s] = temp;
        }
    }

}
