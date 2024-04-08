package com.test.coding.baekjoon.array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * $_25305의 설명
 * 패키지: com.test.coding.baekjoon.array
 * 문제: 커트라인 점수를 구하라.
 * 입력: 첫 줄 N명, 공백 이후 상을 받는 사람 수 K명 둘째 줄 학생의 점수 x 공백 이후 주어짐, 커트라인 점수를 구하라.
 * 출력: 첫 줄 상을 받는 커트라인 점수를 출력해라.
 * 주의사항: 선택정렬, 버블정렬을 사용하여 내림차순을 먼저 하는 것이 중요함.
 * 일시: 3/28/24
 * 정답율: 66%
 * 수행시간: 156ms
**/

public class $_25305 {

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            int i = 0;
            while(st.hasMoreTokens()){
                arr[i]= Integer.parseInt(st.nextToken());
                i++;
            }

            //1. 배열에 주어진 값들을 넣는다.
            //push(arr, arr.length, stt);

            //2.내림차순 정렬 (선택정렬, 버블정렬)
            selectionSort(arr, arr.length);
            //bubbleSort(arr, arr.length);
            System.out.println(Arrays.toString(arr));

            //3. 출력
            //해당 등수 출력
            bw.write(String.valueOf(arr[k - 1]));
            //System.out.println(arr[k - 1]);
            bw.flush();
        }catch(IOException ioe){
            ioe.getStackTrace();
        }
    }

    static void selectionSort(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i; j < n; j++){
                if(arr[min] < arr[j]) {
                    //내림차순
                    min = j;
                    //오름차순일 경우 continue;
                }
                //오름차순일 경우 이곳에
                //min = j; 를 명시함.
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void bubbleSort(int[] arr, int n){
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                swap(arr, j, j + 1);
            }
        }
    }

    static void swap(int[] arr, int f, int s){
        if(arr[f] < arr[s]){
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s] = temp;
        }
    }

}
