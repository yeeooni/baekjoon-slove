package com.test.coding.baekjoon.algorithm.recursion.sum;

public class $_sum {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(sum(arr.length, arr));
    }

    public static int sum(int length, int[] arr){
        if(length == 0) return 0;
        else return sum(length - 1, arr) + arr[length - 1];
    }
}
