package com.test.coding.baekjoon.array;

import java.io.*;

/**
 *
 * $_2018의 설명
 * 패키지: com.test.coding.baekjoon.array
 * 문제: 자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
 *      N의 범위는 1 <= N <= 10000000 이며, 몇 개의 연속된 자연수의 합으로 나타낼 수 있는지 가지수를 구하여라.
 * 입력: N
 * 출력: 자연수의 연속된 합의 가지수
 * 주의사항: O(nlogn) -> O(N) 투포인터를 사용하여 구현한다.
 * 일시: 2024. 7. 8.
 * 정답율: 48%
 * 수행시간: 232ms
**/
public class $_2018 {

    //입력받는 자연수
    static int N;
    //자연수를 저장할 배열
    static int[] arr;

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            //횟수 변수, 시작 인덱스, 종료 인덱스, 총합의 변수
            int count = 1, start = 1, end = 1, sum = 1;

            N = Integer.parseInt(br.readLine());
            arr = new int[N+1];

            //각 인덱스만큼 배열에 값 저장
            for(int i = 1; i < arr.length; i++){
                arr[i] = i;
            }

            while(end != N){
                if(sum == N){   //값을 찾았다면
                    count++;
                    end++;
                    sum += end;
                }
                else if(sum > N){
                    sum -= start;
                    start++;
                }
                else {
                    end++;
                    sum += end;
                }
            }

            bw.write(String.valueOf(count));
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
