package com.test.coding.baekjoon.condition;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_2884의 설명
 * 패키지: com.test.coding.baekjoon.condition
 * 문제: 상근이가 입력한 시간에 45분 일찍 알람 설정하기
 * 입력: 첫째 쭐 두 정수 H, M 0 <= H <= 23, 0 <= M <= 59
 * 출력: 설정해야 하는 알람시간을 출력한다.
 * 주의사항: 불필요한 0은 사용하지 않는다.
 * 일시: 3/16/24
 * 정답율: 37.7%
 * 수행시간: 128ms
**/

public class $_2884 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int hour = Integer.parseInt(st.nextToken());
            int minute = Integer.parseInt(st.nextToken());

            if(minute >= 45) {  //45분 이상이라면
                minute -= 45;
            } else if(hour == 0){   //45분 미만, 시간이 24시라면
                hour = 23;
                minute = (minute - 45) + 60;
            } else { //45분 미만, 시간이 24시가 아니라면
                hour -= 1;
                minute = (minute - 45) + 60;
            }

            bw.write(hour + " " + minute);
            bw.flush();

        }catch(IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }
}
