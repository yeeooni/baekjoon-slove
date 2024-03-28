package com.test.coding.baekjoon.array;

import java.io.*;

/**
 *
 * $_2587의 설명
 * 패키지: com.test.coding.baekjoon.array
 * 문제: N줄이 존재할 때 어떤수 들의 평균값과 중앙값을 찾아라
 * 입력: 첫 째줄 부터 다섯줄 까지 하나씩 자연수가 존재함, 주어지는 자연수는 100보다 작은 10의 배수이다.
 * 출력: 첫 줄엔 평균, 둘째 줄엔 중앙값 출력
 * 주의사항:
 * 일시: 3/28/24
 * 정답율: 62%
 * 수행시간: 132ms
**/
public class $_2587 {
    public static void main(String[] args) {
        //첫 줄엔 평균, 둘째 줄엔 중앙 값
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int[] arr = new int[5];
            push(arr, 0, br);
            //System.out.println(Arrays.toString(arr)); //요소 확인

            print(arr, arr.length, bw);
        } catch (IOException ioe) {
            ioe.getStackTrace();
        }
    }

    //recursion #1
    static void push(int[] arr, int n, BufferedReader br) throws IOException {
        //base case 길이가 끝까지 왔다는 뜻 그 이후는 배열이 존재하지 않는다.
        //그렇기에 모든 원소는 해당 base case 에 수렴한다.
        if (arr.length == n);
        else {
            arr[n] = Integer.parseInt(br.readLine());
            push(arr, n + 1, br);
        }
    }

    //출력 함수
    static void print(int arr[], int n, BufferedWriter bw) throws IOException {
        //1. 평균: 모든 원소를 더하여 최종길이로 나눈다. 0+...+n-1 / n
        //그렇기에 또다른 recursion을 생성한다.
        int avg = sum(arr, n) / n;
        bw.write(avg + "\n");

        //2. 선택정렬을 이용 오름차순 정렬 이후 중앙 인덱스를 찾아 리턴
        selectionSort(arr, arr.length);
        //Arrays.toString(selectionSort(arr, arr.length));
        bw.write(String.valueOf(arr[n / 2]));
        bw.flush();
    }

    //recursion #2
    static int sum(int arr[], int n){
        if(n == 0) return 0;
        else return sum(arr, n - 1) + arr[n - 1];
    }

    //선택정렬 알고리즘
    static int[] selectionSort(int arr[], int n){
        for(int i = 0; i < n - 1; i++){
            //최소값 찾기
            int min = i;
            for(int j = i; j < n; j++){
                if(arr[min] < arr[j]){
                    continue;
                }
                min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
