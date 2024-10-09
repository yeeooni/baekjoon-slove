package com.test.coding.algorithm.recursion.array;

public class $_array {

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(sum(arr, arr.length));
    }

    public static int sum(int[] arr, int length){
        if(length == 0) return 0;
        else return arr[length - 1] + sum(arr, length - 1);
    }

}
