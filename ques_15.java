// Ques - Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;

public class ques_15{
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = scc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}