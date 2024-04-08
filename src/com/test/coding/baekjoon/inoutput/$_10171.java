package com.test.coding.baekjoon.inoutput;
import java.io.*;

/**
 *
 * Solution_10171의 설명
 * 패키지: com.test.coding.baekjoon.inoutput
 * 문제: 고양이 출력
 * 입력: 없음
 * 출력: 고양이를 출력한다.
 * 주의사항: 이스케이프 문자처리를 못하면 망함.
 * 일시: 3/13/24
 * 정답율: 35%
 * 수행시간: 120ms
**/
public class $_10171 {

    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            StringBuilder sb = new StringBuilder();

            sb.append("\\    /\\\n");
            sb.append(" )  ( ')\n");
            sb.append("(  /  )\n");
            sb.append(" \\(__)|");

            bw.write(sb.toString());
        }catch (IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }

}
