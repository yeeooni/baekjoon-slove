package com.test.coding.baekjoon.string;
import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * Solution_2908의 설명
 * 패키지: com.test.coding.baekjoon.string
 * 문제: 상근이의 동생 상수는 입력된 숫자를 거꾸로 읽음. 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램
 *      가장 큰 수를 출력해야 함
 * 입력: 첫째 줄 A, B 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않음
 * 출력: 첫째 줄에 상수의 대답 출력
 * 주의사항:
 * 일시: 3/13/24
 * 정답율: 69%
 * 수행시간: 128ms
**/
public class Solution_2908 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken(), b = st.nextToken();

            char[] chars = a.toCharArray(); //첫 번째 문자열의 char[] '7', '3', '4'
            char[] reserveC = new char[a.length()], reserveCC = new char[b.length()];

            for(int i = 0, j = chars.length - 1; i < chars.length; i++, j--){
                reserveC[i] = chars[j];
            }

            chars = b.toCharArray();    //두 번째 문자열의 char[] '8', '9', '3'

            for(int i = 0, j = chars.length - 1; i < chars.length; i++, j--){
                reserveCC[i] = chars[j];
            }

            int f = Integer.parseInt(new String(reserveC)), ff = Integer.parseInt(new String(reserveCC));

            //두 수를 비교하는 logic
            //BigInteger class를 사용한다면 더욱 효율적일끼?
            if(f < ff) bw.write(String.valueOf(ff));
            else bw.write(String.valueOf(f));

        } catch (IOException ioe){
            System.err.println(ioe.getMessage());
        }
    }
}
