package com.test.coding.baekjoon.algorithm.recursion.binarySearch;

//재귀함수를 이용한 이진탐색 알고리즘
public class $_binarySearch {

    public static void main(String[] args) {
        String[] strings = {"A", "B", "C", "D"};
        System.out.println(search(strings, "D", 1, strings.length - 1));
    }

    public static int search(String[] strings, String target, int begin, int end){
        if(begin > end) return -1;
        else {
            int mid = (begin + end) / 2;
            int result = target.compareTo(strings[mid]);
            if(result == 0) return mid;
            else if(result < 0) return search(strings, target, begin, mid - 1);
            else return search(strings, target, mid + 1, end);
        }
    }

}
