//第一周 输入输出
package Oneweek;

import java.util.Scanner;

public class Oneweek {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt(); // 变量a
            int b =a;
            System.out.println("输出变量b：" + b);
            System.out.println("100-" + a + "=" + (100-a));
        }
    }
}
