package edu.algo.A1;
/**
 * 下列语句各有什么问题（如果有的话）？
 * 注释是为了不报错
 * */

public class A1_1_4 {
    public static void main(String[] args) {
        // if (a > b) then c = 0;  // Error:(5, 25) java: variable declaration not allowed here
        // if a > b { c = 0; }     // Error:(6, 11) java: '(' expected
                                   // Error:(6, 17) java: ')' expected
        // if (a > b) c = 0;
        // if (a > b) c = 0 else b = 0; // Error:(10, 29) java: ';' expected
    }
}
