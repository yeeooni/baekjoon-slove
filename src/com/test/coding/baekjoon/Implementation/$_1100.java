package com.test.coding.baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

/**
 *
 * $_1100의 설명
 * 패키지: com.test.coding.java.main
 * 문제: 체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 *      +-------------------------------+
 *      +[.] [F] [.] [F] [.] [.] [.] [F]+
 *      +[F] [.] [.] [.] [F] [.] [F] [.]+
 *      +[.] [.] [.] [F] [.] [F] [.] [F]+
 *      +[F] [.] [F] [.] [.] [.] [F] [.]+
 *      +[.] [F] [.] [.] [.] [F] [.] [.]+
 *      +[F] [.] [.] [.] [F] [.] [F] [.]+
 *      +[.] [F] [.] [F] [.] [F] [.] [F]+
 *      +[.] [.] [F] [F] [.] [.] [F] [.]+
 *      +-------------------------------+
 *
 * 입력: 첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
 * 출력: 첫째 줄에 문제의 정답을 출력한다.
 * 주의사항:
 * 일시: 2024. 10. 11.
 * 정답율: 71.885%
 * 수행시간: 104ms
 **/
public class $_1100 {

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            //캐릭터 8 * 8 2차원 배열 초기화
            char[][] arr = new char[8][8];

            //입력 값 저장 변수
            String str;
            int count = 0, j = 0; //열 첨자

            while((str = br.readLine()) != null){
                char[] chars = str.toCharArray(); //입력 값 배열화
                for(int i = 0, k = 0; i < chars.length; i++, k++){ //8*8 = 64 길이의 1차원 배열
                    if(k >= 8) {k = 0;} //행이 8이상 나올 수 없으므로 행 첨자 즉각 초기화
                    arr[j][k] = chars[i]; //2차원 배열 값 매핑
                }
                j++;    //열 첨자 증가
            }

            //(0,0), (0,2), (0,4), (0,6)
            //(1,1), (1,3), (1,5), (1,7)
            //(2,0), (2,2), (2,4), (2,6)
            //(3,1), (3,3), (3,5), (3,7)
            //(4,0), (4,2), (4,4), (4,6)
            //(5,1), (5,3), (5,5), (5,7)
            //(6,0), (6,2), (6,4), (6,6)
            //(7,1), (7,3), (7,5), (7,7)
            for(int i = 0; i < arr.length; i++){
                for(int k = 0; k < arr[i].length; k++){
                    //SEE 행 첨자가 홀수이면, 열 첨자도 홀수를 체크
                    // 반대로 행 첨자가 짝수이면, 열 첨자도 짝수를 체크
                    if(i % 2 == 1 && k % 2 == 1){
                        if(arr[i][k] == 'F') count++;
                    }else if(i % 2 == 0 && k % 2 == 0){
                        if(arr[i][k] == 'F') count++;
                    }
                }
            }

            //총 개수 출력
            bw.write(String.valueOf(count));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
