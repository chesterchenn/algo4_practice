package edu.algo.A1;

/**
 * 以下代码段会打印出什么结果？
 */

public class A1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        // 0
        // 1
        // .
        // .
        // .
        // 9
    }
}
