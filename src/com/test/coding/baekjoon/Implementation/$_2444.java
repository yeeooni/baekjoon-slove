package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_2444 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *          X
 *         XXX
 *        XXXXX
 *       XXXXXXX
 *      XXXXXXXXX
 *       XXXXXXX
 *        XXXXX
 *         XXX
 *          X
 * 주의사항:
 * 일시: 2024. 10. 18.
 * 정답율: 56%
 * 수행시간:
**/
public class $_2444 {

    final static char STAR = '*';

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int n = Integer.parseInt(br.readLine());
            bw.write(print(n, 2*n-1).toString());

            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static StringBuilder print(int n, int size){
        StringBuilder sb = new StringBuilder();
        int mid = size / 2;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j < mid - i) sb.append(" "); //왼쪽 빈칸 담당
                else if(j > mid + i);           //피라미드 구조
                else if(i > mid + j) sb.append(" "); //역피라미드
                else if(i + j > (n + size) - 2);     //오른쪽 빈칸 담당
                else sb.append(STAR);
                //역피라미드 예시)
                //n = 5

                //5행부터 역으로 피라미드를 그려야하므로
                //i=5(행), j=0-8(열)
                //1. 5+0 > (5+9)-2
                //2. 5+1 > (5+9)-2
                //...7열이 됬을때
                //3. 5+7(13) > 12 조건이 만족하므로 1칸은 그리지 않고 개행처리함
                //...6행이 됬을때
                //1,2 반복 후 3. 처리
            }
            sb.append("\n");
        }

        return sb;
    }

}
