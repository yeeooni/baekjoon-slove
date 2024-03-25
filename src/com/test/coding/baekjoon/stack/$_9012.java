package com.test.coding.baekjoon.stack;

import java.io.*;
import java.util.Stack;

/**
 *
 * $_9012의 설명
 * 패키지: com.test.coding.baekjoon.stack
 * 문제: 괄호 문자열 '(' ')', VPS 짝 찾기
 * 입력: T 테스트 케이스, T개의 테스트 줄에는 괄호가 한 줄로 주어짐
 * 출력: 올바른 VPS면 YES, 아니면 NO 출력
 * 주의사항: 스택의 삽입&삭제 구조 개념이 선행학습 되어야 함
 * 일시: 3/25/24
 * 정답율: 45%
 * 수행시간: 136ms
**/

public class $_9012 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int t = Integer.parseInt(br.readLine());
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < t; i++){
                String answer = "YES";
                String str = br.readLine();

                for(int j = 0; j < str.length(); j++){
                    // 여는 괄호가 들어오면, 스택에 넣는다.
                    if(str.charAt(j) == '(') stack.push(str.charAt(j));
                        // 닫는 괄호가 들어오고, 기존에 스택이 비어있지 않다면 (즉, 여는 괄호가 존재 한다면) Top을 삭제한다.
                    else if(!stack.isEmpty() && str.charAt(j) == ')') stack.pop();
                        // 스택이 비었고, 닫는 괄호가 들어오지 않았음 (여는 괄호 조차 들어오지 않았다는 뜻임)
                    else answer = "NO";
                }

                if(!stack.isEmpty()) answer = "NO";

                stack.clear();  //stack 초기화
                bw.write(answer + "\n");
            }

            bw.flush();
        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }
}

