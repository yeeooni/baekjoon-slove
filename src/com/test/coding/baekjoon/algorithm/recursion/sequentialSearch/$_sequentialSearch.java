package com.test.coding.baekjoon.algorithm.recursion.sequentialSearch;

//재귀함수를 이용한 순차검색 알고리즘
public class $_sequentialSearch {
    public static void main(String[] args) {
        int[] arr = {50, 3, 19, 39, 20, 10};
        System.out.println(search(arr, 39, 0, arr.length - 1));
        System.out.print(otherSearch(arr, 3, 0, arr.length - 1));
    }
    public static int search(int[] arr, int target, int begin, int end){
        if(begin == end) return arr[begin];
        else if(begin > end) return -1;
        else if(target == arr[begin]) return begin;
        else return search(arr, target, begin + 1, end);
    }
    public static int otherSearch(int[] arr, int target, int begin, int end){
        /*if(begin == end) return arr[begin];
        else */if(begin > end) return -1;
        else {
            int mid = (begin + end) / 2;
            if (target == arr[mid]) return mid;
            //recursion
            int result = otherSearch(arr, target, begin, mid - 1);
            if(result != -1) return result;
            //recursion
            else return otherSearch(arr, target, mid + 1, end);
        }
    }

}
