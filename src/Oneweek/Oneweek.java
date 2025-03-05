//第一周 输入输出
package Oneweek;

import java.util.Scanner;

public class Oneweek {
    public static void main(String[] args) {

        //1.2变量与计算
        // // System.out.println("Hello, World!");
        // try (Scanner in = new Scanner(System.in)) {
        //     System.out.print("请输入一个整数a：");
        //     int a = in.nextInt(); // 变量a
        //     int b =a;
        //     final int amount = 100;  // 声明一个常量amount，值为100
        //     // int vat_amount = in.nextInt();
        //     System.out.println("输出变量b：" + b);
        //     System.out.println(amount + "-" + a + "=" + (amount-a));
        // }
        // 1.3 浮点数计算
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextInt();
        System.out.println("foot"+foot+","+"inch"+inch);
        //类型的转换
        System.out.println((int)((foot+inch/12)*0.3048*100)); 
        //oneweek作业
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        System.out.println((int)((f-32)*5/9));
    }
}
