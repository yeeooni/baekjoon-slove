package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_2443 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 첫째 줄에는 별 2×N-1개, 둘째 줄에는 별 2×N-3개, ..., N번째 줄에는 별 1개를 찍는 문제
 *      별은 가운데를 기준으로 대칭이어야 한다.
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *      XXXXXXXXX
 *       XXXXXXX
 *        XXXXX
 *         XXX
 *          X
 * 주의사항:
 * 일시: 2024. 10. 17.
 * 정답율: 75.108%
 * 수행시간: 108ms
**/
public class $_2443 {

    final static char STAR = '*';

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(print(n)));

            //System.out.println((2*n)-1);
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static StringBuilder print(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0, k= 2*n-1; i < n; i++, k--){
            for(int j = 0; j < 2*n-1; j++){
                // 0행 전부
                // 1행 1열, 9열
                // 2행 1-2열, 8-9열
                // 3행 1-3열, 7-9열
                if(i > j) sb.append(" ");
                else if(j >= k);
                else sb.append(STAR);
            }
            sb.append("\n");
        }
        return sb;
    }

}
