package com.test.coding.baekjoon.string;

import java.io.*;
/**
 *
 * Solution_11720의 설명
 * 패키지: com.test.coding.baekjoon.string
 * 문제: N개의 숫자가 공백 없이 쓰여있음. 이 숫자를 모두 합해서 출력하는 프로그램
 * 입력: 첫째 줄에 숫자의 개수 N (1 <= N <= 100) 둘째 줄 숫자 N개가 공백없이 주어짐
 * 출력: 입력으로 주어진 숫자 N개의 합을 출력
 * 주의사항:
 * 일시: 3/13/24
 * 정답율: 55%
 * 수행시간: 128ms
**/
public class Solution_11720 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            char[] chars = br.readLine().toCharArray();

            for(int i = 0; i < n; i++){
                //각 char 숫자를 추출하여 sum
                sum += Character.getNumericValue(chars[i]);
            }

            bw.write(String.valueOf(sum));
            bw.flush();
        }catch(IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }

}
