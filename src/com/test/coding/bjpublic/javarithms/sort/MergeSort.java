package com.test.coding.bjpublic.javarithms.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] arr = {4, 5, 1, 2, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int begin, int end){
        if(begin < end){
            int mid = (begin+end) / 2;
            mergeSort(arr, begin, mid);
            mergeSort(arr, mid + 1, end);
            mergeSort(arr, begin, mid, end);
        }
    }

    static void mergeSort(int[] arr, int begin, int middle, int end){
        int i = begin, j = middle + 1, k = begin;
        int[] temp = new int[arr.length];

        while(i <= middle && j <= end){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= middle){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(int l = begin; l <= end; l++)
            arr[l] = temp[l];
    }

}
