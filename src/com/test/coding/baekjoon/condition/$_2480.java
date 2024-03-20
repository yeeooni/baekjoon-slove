package com.test.coding.baekjoon.condition;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_2480의 설명
 * 패키지: com.test.coding.baekjoon.condition
 * 문제: 주사위 세개의 숫자를 통하여 금액을 계산한다.
 * 입력: 3개의 주사위 눈이 빈칸을 사이에 두고 입력된다.
 * 출력: 상금을 계산하여 출력한다.
 * 주의사항: 조건문을 잘 사용해야함
 * 일시: 3/20/24
 * 정답율: 47%
 * 수행시간: 124ms
**/

public class $_2480 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int money;
            int i = 0, ii = 0, iii = 0;

            while (st.hasMoreTokens()){
                i = Integer.parseInt(st.nextToken());
                ii = Integer.parseInt(st.nextToken());
                iii = Integer.parseInt(st.nextToken());
            }

            //계산식
            //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
            //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
            //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

            //삼항연산자를 사용함.
            money = (i == ii && i == iii) ? 10000 + i * 1000 : (i == ii || i == iii) ? 1000 + i * 100 : (ii == iii) ? 1000 + ii * 100 : Math.max(Math.max(i, ii), iii) * 100;

            bw.write(String.valueOf(money));
            bw.flush();
        }catch (IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }
}
