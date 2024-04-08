package com.test.coding.baekjoon.string;

import java.io.*;
/**
 *
 * $_10809의 설명
 * 패키지: com.test.coding.baekjoon.string
 * 문제: 알파벳 소문자 S, 단어에 포함되어 있는 경우 해당 인덱스 리턴 포함되지 않았을 경우 -1 (문제 이해하는데 20분 이상 걸림....)
 * 입력: 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 출력: 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 *      만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 * 주의사항:
 * 일시: 3/15/24
 * 정답율: 53%
 * 수행시간: 124ms
**/
public class $_10809 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            char[] chars = new String("abcdefghijklmnopqrstuvwxyz").toCharArray();
            String str = br.readLine();
            for(Character c : chars){
                bw.write(str.indexOf(c) + " ");
            }

            bw.flush();

        }catch (IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }

}
