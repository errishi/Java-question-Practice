//Swap two numbers without using any third variable.

import java.util.*;
public class ques_2{
    public static void swapNum(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Swapped Numbers are-");
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = scc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = scc.nextInt();
        swapNum(num1, num2);
    }
}