package com.test.coding.baekjoon.inoutput;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * Solution_1008의 설명
 * 패키지: com.test.coding.baekjoon.inoutput
 * 문제: 두 정수 A와 B를 입력받은 다음, A/B 출력
 * 입력: 첫째 줄 A, B (0 le A, B le 10)
 * 출력: 첫째 줄에 A/B 출력
 * 주의사항: 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다. (정수형은 사용하지 말라는 뜻)
 * 일시: 3/13/24
 * 정답율: 2023/3/10 시점 약 34%
 * 수행시간: 220ms -> 132ms 단축
**/

public class $_1008 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());

            bw.write(String.valueOf(a / b));
        }catch (IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }

}
