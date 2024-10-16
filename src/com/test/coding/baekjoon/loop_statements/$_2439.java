package com.test.coding.baekjoon.loop_statements;

import java.io.*;

/**
 *
 * $_2439의 설명
 * 패키지: com.test.coding.baekjoon.loop_statements
 * 알고리즘 분류: 구현
 * 문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *      하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *     X
 *    XX
 *   XXX
 *  XXXX
 * XXXXX
 * 주의사항: 별이 오른쪽으로 정렬되어있음.
 * 일시: 2024. 10. 16.
 * 정답율: 56%
 * 수행시간: 128ms -> 108ms
**/
public class $_2439 {

    final static char STAR = '*';

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int n = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(print(n)));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static StringBuilder print(int n){
        StringBuilder sb = new StringBuilder();

        //k 는 n 행의  n-i 와 같은 역할이다.
        // 1행 -> 4
        // 2행 -> 3
        // 3행 -> 2
        // 4행 -> 1
        // 5행 -> 0

        for(int i = 0, k = n-1; i < n; i++, k--){
            for(int j = 0; j < n; j++){
                if(j < k) sb.append(" ");
                else sb.append(STAR);
            }
            sb.append("\n");
        }
        return sb;
    }

}
