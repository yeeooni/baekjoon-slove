package com.test.coding.baekjoon.condition;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_2525의 설명
 * 패키지: com.test.coding.baekjoon.condition
 * 문제: 오븐시계의 오븐구이가 끝나는 시각을 계산하는 프로그램 작성
 * 입력: 첫째줄 시 0 <= A <= 23, 분 0 <= B <= 59 | 두번째 요리하는 데 필요한 시간 0 <= C <= 1000
 * 출력: 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
 * 주의사항:
 * 일시: 3/19/24
 * 정답율: 38%
 * 수행시간: 124ms
**/

public class $_2525 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());

            int hour = Integer.parseInt(st.nextToken()), minute = Integer.parseInt(st.nextToken());
            int cooking = Integer.parseInt(br.readLine());

            hour += (minute + cooking) / 60;
            minute = (minute + cooking) % 60;

            if(hour > 24) hour -= 24;
            else if(hour == 24) hour = 0;

            bw.write(hour + " " + minute);
            bw.flush();
        }catch (IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }
}
