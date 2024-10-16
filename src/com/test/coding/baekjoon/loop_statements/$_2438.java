package com.test.coding.baekjoon.loop_statements;

import java.io.*;

/**
 *
 * $_2438의 설명
 * 패키지: com.test.coding.baekjoon.loop_statements
 * 알고리즘 분류: 구현
 * 문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * X
 * XX
 * XXX
 * XXXX
 * XXXXX
 * 주의사항:
 * 일시: 2024. 03. 11.
 * 정답율: 62%
 * 수행시간: 304ms -> 104ms
 **/
public  class $_2438 {

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
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                sb.append(STAR);
            }
            sb.append("\n");
        }
        return sb;
    }

}
