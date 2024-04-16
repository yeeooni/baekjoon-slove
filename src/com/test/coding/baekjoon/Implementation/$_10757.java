package com.test.coding.baekjoon.Implementation;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * $_10757의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. 0 < A,B < 10E10000
 * 출력: 첫째 줄에 A+B를 출력한다.
 * 주의사항: 숫자의 범위를 잘 생각하고 풀어야 함. 정말 간단한 문제임에도 불구하고 틀린 사람이 많아서 기록에 남김.
 * 일시: 4/16/24
 * 정답율: 49%
 * 수행시간: 248ms
**/
public class $_10757 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextElement().toString()), b = new BigInteger(st.nextElement().toString());

            bw.write(a.add(b).toString());
            bw.flush();
        }catch(IOException ioe) {
            ioe.getStackTrace();
        }
    }
}
