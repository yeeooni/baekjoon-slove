package com.test.coding.baekjoon.string;

import java.io.*;

/**
 *
 * $_5622의 설명
 * 패키지: com.test.coding.baekjoon.string
 * 문제: 다이얼 주어진 문자를 가지고 전화를 걸 때 필요한 최소 시간을 계산한다.
 * 입력: 알파벳 대문자가 주어진다. 2 <= 단어 <= 15
 * 출력: 최소 시간을 출력한다.
 * 주의사항: 다이얼 0, 1은 알파벳이 존재하지 않음, 1을 입력할 때 2초 소요 나머지 시간은 1초씩 증가
 * 일시: 3/20/24
 * 정답율: 58%
 * 수행시간: 124ms
**/

public class $_5622 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String alphabet = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            String[] strings = new String[alphabet.length() / 3];

            //입력된 알파벳을 char 배열로 표현 e.g., 'W', 'A'
            char[] chars = br.readLine().toCharArray();
            int time = 0;

            //알파벳의 총 길이는 26 / 3 = 8 길이의 배열이 생성됨
            for(int i = 0; i < strings.length; i++){
                strings[i] = alphabet.substring(i * 3, (i * 3) + 3);

                if(i == 5) //첫 번째 PQRS
                    strings[i] = alphabet.substring(i * 3, (i * 3) + 4);
                else if(i == 7) //두 번째 WXYZ
                    strings[i] = alphabet.substring((i * 3) + 1);
            }

            //"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
            // 0, 1, 2, 3, 4, 5, 6, 7
            // 3초, 4초, 5초, 6초, 7초, 8초, 9초, 10초

            for(int i = 0; i < chars.length; i++){
                for(int j = 0; j < strings.length; j++){
                    if(strings[j].contains(Character.toString(chars[i])))
                        time += j + 3;
                }
            }

            //출력된 시간
            bw.write(String.valueOf(time));
            bw.flush();
        }catch (IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }

}
