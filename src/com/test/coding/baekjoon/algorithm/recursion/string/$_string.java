package com.test.coding.baekjoon.algorithm.recursion.string;

public class $_string {

    public static void main(String[] args) {
        String str = "HelloWorld!";
        int l = length(str);
        System.out.println(l);
        printChars(str);
        System.out.println();
        printReversChars(str);
    }

    public static int length(String str){
        if("".equals(str)) return 0;
        else return 1 + length(str.substring(1));
    }

    public static void printChars(String str){
        if(str.length() == 0 || "".equals(str));
        else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    public static void printReversChars(String str){
        if("".equals(str) || str.length() == 0);
        else {
            printReversChars(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

}
