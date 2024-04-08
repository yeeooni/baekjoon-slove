package com.test.coding.bjpublic.javarithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 1, 6, 8, 7, 3 };
        System.out.println(Arrays.toString(insertionSort(arr, arr.length)));
    }

    static int[] insertionSort(int[] arr, int n){
        //[1, 2, 3, 4, 5, 6, 7, 8]
        //1~n-1
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j;
            for(j = i - 1; j >= 0 && arr[j] > temp; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;


            //배열의 뒤에서 처리할 수 있는 방법을 생각해보자.
        }
        return arr;
    }

}
