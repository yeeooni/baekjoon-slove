package com.test.coding.baekjoon.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

import java.util.*;


/**
 *
 * $_1157의 설명
 * 패키지: com.test.coding.baekjoon.string
 * 문제:
 * 입력:
 * 출력:
 * 주의사항:
 * 일시: 2024. 10. 9.
 * 정답율:
 * 수행시간:
**/
public class $_1157 {
    //알파벳 단어 중 가장 많이 사용된 알파벳 체크
    //단, 대소문자 구분하지 않음
    //가장 많이 사용된 알파벳을 대문자로 출력하거나 여러 개가 존재하는 경우 ? 출력

    //각 단어의 카운트를 저장한다.

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            //static function defined
            func(br.readLine(),bw);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static void func(String str, BufferedWriter bw) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();   //입력받은 문자를 쪼개어 배열에 저장

        for(int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){  //기존에 값이 존재한다면 +1
                int cnt = map.get(chars[i]);
                map.put(chars[i], ++cnt);
            }else{
                map.put(chars[i], 1);
            }
        }

        Stack<Integer> stack = new Stack<>();
        for(char c : map.keySet()){
            stack.push(map.get(c));
            System.out.println(map.get(c));
        }

        System.out.println(stack);
        bw.flush();
    }

}
