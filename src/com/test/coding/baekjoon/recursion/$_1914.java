package com.test.coding.baekjoon.recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * $_1914의 설명
 * 패키지: com.test.coding.algorithm.recursion
 * 문제: 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
 *      한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
 *      쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
 *      이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
 *
 *      아래 그림은 원판이 5개인 경우의 예시이다.
 *      +-----------------------------------------+
 *      +    [[]]
 *      +   [][][]
 *      +  [][][][]
 *      + [][][][][]
 *      +[][][][][][]
 *      +----0001----- ----0002----- ----0003-----+
 *      +-----------------------------------------+
 *
 * 입력: 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄에 옮긴 횟수 K를 출력한다.
 *      N이 20 이하인 입력에 대해서는 두 번째 줄부터 수행 과정을 출력한다.
 *      두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
 *      N이 20보다 큰 경우에는 과정은 출력할 필요가 없다.
 * 주의사항:
 * 일시: 2024. 10. 11.
 * 정답율: 23%
 * 수행시간: 4104ms
 **/
public class $_1914 {

    //원판 개수 N
    //옮긴 횟수 K

    public static void  main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            final int N = Integer.parseInt(br.readLine());
            //옮기는 과정을 숫자로 표현 1(A), 2(B), 3(C)
            bw.write(String.valueOf(hanoi(N))); //총 옮긴 횟수
            bw.newLine();
            bw.flush();

            if(N <= 20) hanoi(N, 1, 2, 3); //옮기는 과정
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static BigInteger hanoi(int n){

//FIXME 반례) 100번을 이동한다면, 숫자의 범위가 커지므로 int, long 으로는 제약이 있음
//        int k = 1;
//        if(n == 1){return BigInteger.valueOf(k);}
//        k = 1 + 2 * hanoi(n - 1);
//        return k;
//        2^n - 1

        // 1{가장 큰 원반을 이동할 횟수} + 2 * f(n - 1){나머지 원반의 이동 횟수}
        return new BigInteger("2").pow(n).subtract(BigInteger.ONE);
    }

    static void hanoi(int n, int start, int temp, int end) {
        if(n == 1){
            //System.out.printf("%d %d", start, end); //FIXME 해당 코드는 메모리초과의 원인이 됨
            System.out.println(start + " " + end); //A -> C
            return;
        }

        hanoi(n - 1, start, end, temp);
        //System.out.printf("%d %d", start, end); //FIXME 해당 코드는 메모리초과의 원인이 됨
        System.out.println(start + " " + end); //A -> C
        hanoi(n - 1, temp, start, end);
    }

}
