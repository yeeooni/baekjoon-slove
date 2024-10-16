package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_2422 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation;
 * 알고리즘 분류: 구현
 * 문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
 *      별은 가운데를 기준으로 대칭이어야 한다.
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *     X
 *    XXX
 *   XXXXX
 *  XXXXXXX
 * XXXXXXXXX
 * 주의사항:
 * 일시: 2024. 10. 16.
 * 정답율: 55.338%
 * 수행시간: 104ms
 **/
public class $_2422 {

    final static char STAR = '*';
    //final static int COLUMN = 9;

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
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2*n-1; j++){
                //2N - 1
                if(j < ((2*n-1) / 2) - i) sb.append(" ");
                else if(j > ((2*n-1) / 2) + i);
                else sb.append(STAR);
            }
            sb.append("\n");
        }
        return sb;
    }

}
