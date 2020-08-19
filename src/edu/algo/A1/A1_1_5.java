package edu.algo.A1;

/**
 * 编写一段程序，如果 double 类型的变量 x 和变量 y 都严格位于 0 和 1 之间则打印 true, 否则打印 false
 */
public class A1_1_5 {
    public static void main(String[] args) {
        double x = Math.random() * 2;
        double y = Math.random() * 2;
        System.out.println("x: " + x + ", y: " + y);
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
