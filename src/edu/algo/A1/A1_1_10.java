package edu.algo.A1;

/**
 * 下面这段代码有什么问题？
 */

public class A1_1_10 {
    public static void main(String[] args) {

//        int[] a;
//        for (int i = 0; i < 10; i++)
//            a[i] = i * i;

        /* 它没有用 new 为 a[] 分配内存。
           这段代码会产生一个 variable a might not have been initialized的编译错误。
           可能尚未初始化变量 a。
         */
    }
}
