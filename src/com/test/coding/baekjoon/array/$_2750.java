package com.test.coding.baekjoon.array;

import java.io.*;
import java.util.Arrays;

/**
 *
 * $_2750의 설명
 * 패키지: com.test.coding.baekjoon.array
 * 문제: N개의 수가 주어졌을 때, 오름차순 정렬 프로그램
 * 입력: 첫째 줄 수의 개수 N (1 <= N <= 1000), 둘째 줄 N개의 줄에는 수가 주어짐.
 * 출력: 오름차순 결과를 한 줄에 하나씩 출력한다.
 * 주의사항:
 * 일시: 3/28/24
 * 정답율: 58%
 * 수행시간:164ms
**/

public class $_2750 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            bubbleSort(arr, arr.length, br, bw);
        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }

    public static void bubbleSort(int[] arr, int n, BufferedReader br, BufferedWriter bw) throws IOException {
        push(arr, 0, br);

        //총 배열{1, 2, 3, 4, 5}의 크기가 5라고 가정한다면 비교횟수를 구하는 공식은 아래와 같다.

        //1라운드 비교 시 5(배열긔크기) - 1(라운드) = 4번
        //2라운드 5 - 2 = 3번
        //3라운드 5 - 3 = 2번
        //... arrayLength - round = 비교 횟수

        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                if(arr[j] > arr[j+1]) swap(arr, j, j + 1);
            }
        }
        Arrays.stream(arr).forEach(i -> {
            try{
                bw.write(i + "\n");
            }catch (IOException ioe){
                throw new RuntimeException();
            }
        });
        bw.flush();
    }

    //적절한 recursion 사용
    public static void push(int[] arr, int n, BufferedReader br) throws IOException {
        //1. arr의 length과 n이 같다면 종료 (즉, 마지막 인덱스를 지나갔다는 것과 같다.)
        //2. arr의 0부터 arr.length - 1까지 순차적으로 데이터가 삽입되어야 함
        if (arr.length == n);
        else {
            arr[n] = Integer.parseInt(br.readLine());
            push(arr, n + 1, br);
        }
    }

    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
