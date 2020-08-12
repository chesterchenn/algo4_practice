package edu.algo;

/**
 * 编写一个程序，从命令行得到三个整数参数。如果他们都相等则打印 equal，否则打印 not equal。
 * */
public class A1_1_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

}
