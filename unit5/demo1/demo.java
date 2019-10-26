package demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        try {
            add();
        } catch (Exception ex) {
            if (ex instanceof Ex){
                System.out.println("不能大于100");
            }else if (ex instanceof InputMismatchException){
                System.out.println("输入有误");
            }
        }

    }
    public static void add() throws Ex {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入除数：");
        int i = input.nextInt();
        if (i>100){
            throw new Ex("不能大于100");
        }
    }
}
