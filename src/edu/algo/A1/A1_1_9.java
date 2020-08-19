package edu.algo.A1;

/**
 * 编写一段代码，将一个正整数 N 用二进制表示并转换威一个 String 类型的值 s
 */

public class A1_1_9 {
    public static void main(String[] args) {
        int N = (int)Math.round(Math.random() * 100);
        System.out.println("N: " + N);
        String s1 = "";
        s1 = Integer.toBinaryString(N);

        String s2 = "";
        for (int n = N; n > 0; n /= 2)
            s2 = (n % 2) + s2;

        String s3 = "";
        for (int n = N; n > 0; n = n >> 1) {
            s3 = (n % 2) + s3;
        }


        System.out.println("s1: " + s1 + ", s2: " + s2 + ", s3: " + s3);
    }
}
