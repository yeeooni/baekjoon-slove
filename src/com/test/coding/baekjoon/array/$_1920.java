package com.test.coding.baekjoon.array;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_1920의 설명
 * 패키지: com.test.coding.baekjoon.array
 * 문제: 수찾기 (N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.)
 * 입력: 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
 * 출력: M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
 * 주의사항: 정답의 기준은 M배열의 값으로 한다.
 * 일시: 4/6/24
 * 정답율: 30%
 * 수행시간: 2756ms
**/

public class $_1920 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            //입력된 숫자를 a 배열에 push
            int i = 0;
            while(st.hasMoreTokens()){
                a[i++] = Integer.parseInt(st.nextToken());
            }

            int k = Integer.parseInt(br.readLine());
            int[] b = new int[k];

            st = new StringTokenizer(br.readLine());

            //입력된 숫자를 b 배열에 push
            int j = 0;
            while(st.hasMoreTokens()){
                b[j++] = Integer.parseInt(st.nextToken());
            }

            //주의사항 정답의 순서는 b 배열을 기준으로 한다.
            //그렇기에 가장 먼저 b 배열의 포문을 실행한다.
            for(int ii = 0; ii < b.length; ii++){
                // FIXME 변수 할당을 주석 처리하여 시간초과를 방지함
                //int baseNumber = b[ii];

                // FIXME recursion 을 이용하여 이진탐색을 처리하려 했으나, 시간초과 문제 발생으로 주석처리 함
                //bw.write(Arrays.binarySearch(b, 0, b.length - 1, baseNumber) + "\n");
                bw.write(search(a, 0, a.length - 1, b[ii]) + "\n");
            }

            bw.flush();
        }catch(IOException ioe){
            ioe.getStackTrace();
        }
    }

    static int search(int[] a, int begin, int end, int target){
        for(int i = begin; i <= end; i++){
            if(target == a[i]) return 1;
        }
        return 0;
    }

}
