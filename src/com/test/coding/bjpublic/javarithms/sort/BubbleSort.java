package com.test.coding.bjpublic.javarithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 7, 9, 3, 5, 6, 8, 10};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort(int[] arr, int n){
        // 1 ~ n
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                /*if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }*/
                swap(arr, j, j+1);
            }
        }

        return arr;
    }
    static int[] swap(int[] arr, int f, int s){
        if(arr[f] > arr[s]){
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s] = temp;
        }
        return arr;
    }

}
