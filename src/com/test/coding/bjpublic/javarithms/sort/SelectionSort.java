package com.test.coding.bjpublic.javarithms.sort;

import java.io.*;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //HelloWorld 선택정렬을 사용하여 오름차순 하시오.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            //SelectionSort ss = new com.test.coding.baekjoon.main.java.SelectionSort();
            char[] chars = br.readLine().toCharArray();

            //HelloWorld -> HWdellloor
            //72 87 100 101 109 111 114
            bw.write(Arrays.toString(selectionSort(chars, chars.length)));
            bw.flush();
        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }
    static char[] selectionSort(char[] chars, int n){
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i; j < n; j++){ // 0 ~ n-1
                //기존의 값이 다음 인덱스 보다 작다면 아무일도 하지 않음, 현재 min 변수의 인덱스가 min이라는 판단.
                if(chars[min] < chars[j]){
                    continue;
                }
                min = j;
            }
            swap(chars, i, min);
        }
        return chars;
    }
    static void swap(char[] chars, int f, int s){
        char temp = chars[f];
        chars[f] = chars[s];
        chars[s] = temp;
    }

}


