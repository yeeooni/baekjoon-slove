package com.test.coding.baekjoon.stack;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * $_10828의 설명
 * 패키지: com.test.coding.baekjoon.stack
 * 문제: 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
        명령은 총 다섯 가지이다.
        - push X: 정수 X를 스택에 넣는 연산이다.
        - pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        - size: 스택에 들어있는 정수의 개수를 출력한다.
        - empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        - top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 입력: 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 출력: 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 * 주의사항: StringTokenizer 의 반복문을 (아주) 잘 다룰줄 알아야한다. nextToken(), nextElement()의 특징을 잘 알고 있어야 풀이가 가능함.
 * 일시: 4/7/24
 * 정답율: 37%
 * 수행시간: 200ms
**/
public class $_10828 {

    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            //명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
            //굳이, int 타입을 선언하지 않아도 공간이 넉넉하다.
            short n = Short.parseShort(br.readLine());
            StringTokenizer st;
            String str;

            for(int i = 1; i <= n; i++){
                st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    str = st.nextToken(); //명령어를 저장
                    if("push".equals(str)){ //push를 만난다면, 뒤따라오는 숫자값을 스택에 저장한다.

                        //저장되어야 할 정수는 100000까지 저장될 수 있으므로 int 타입이면 충분하다.
                        stack.push(Integer.parseInt(st.nextToken()));
                    }
                    else {  //그외 나머지는 별도의 명령어를 처리한다.
                        bw.write(stackCmd(str));
                    }
                }
            }

            bw.flush();
        }catch(IOException ioe){
            ioe.getStackTrace();
        }catch(EmptyStackException ese){
            ese.getStackTrace();
        }
    }

    static String stackCmd(String str) {
        switch(str){
            case "pop":
                return stack.size() == 0 ? "-1" + "\n" : stack.pop() + "\n";
            case "size":
                return stack.size() + "\n";
            case "empty":
                return stack.empty() ? "1" + "\n" : "0" + "\n";
            case "top":
                return stack.size() == 0 ? "-1" + "\n" : stack.peek() + "\n";
        }
        return null;
    }

}
