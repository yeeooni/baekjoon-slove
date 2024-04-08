package com.test.coding.baekjoon.deepending;

import java.io.*;

/**
 *
 * $_2941의 설명
 * 패키지: com.test.coding.baekjoon.deepending
 * 문제: 크로아티아 알파벳 갯수 세기
 * 입력: 100문자 알파벳 소문자, '-', '='
 * 출력: 입력된 단어의 크로아티아 알파벳의 갯수 출력
 * 주의사항:
 * 일시: 3/18/24
 * 정답율: 44.4%
 * 수행시간: 124ns
**/
public class $_2941 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String str = br.readLine();
            String[] arr = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            for(String s : arr){
                if(str.contains(s)) {
                    str = str.replaceAll(s, "0");
                }
            }

            bw.write(String.valueOf(str.length()));
            bw.flush();
        }catch (IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }

}
