package com.test.coding.baekjoon.string;

import java.io.*;

public class Solution_11720 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            char[] chars = br.readLine().toCharArray();

            for(int i = 0; i < n; i++){
                //각 char 숫자를 추출하여 sum
                sum += Character.getNumericValue(chars[i]);
            }

            bw.write(String.valueOf(sum));
            bw.flush();
        }catch(IOException ioe){
            System.err.print(ioe.getMessage());
        }
    }

}
