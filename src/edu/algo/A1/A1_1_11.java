package edu.algo.A1;

/**
 * 编写一段代码，打印出一个二维布尔数组的内容。其中，用 * 表示真，空格表示假。打印出行号和列号。
 */

public class A1_1_11 {
    public static void main(String[] args) {
        boolean[][] arr = {{true, false, true, true}, {false, true, true, false}, {false, false, true, false}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("第" + (i + 1) + "行，第" + (j + 1) + "列的值是" + (arr[i][j] ? "*" : " "));
            }
        }
    }
}
