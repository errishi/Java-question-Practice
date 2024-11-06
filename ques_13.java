// Ques - Write a program that reads a set of integers,and then prints the sum of the even and odd integers

import java.util.*;

public class ques_13{
    public static void main(String args[]){
        int sumEven = 0;
        int sumOdd = 0;

        Scanner scc = new Scanner(System.in);
        int n = scc.nextInt();

        for(int i = 1; i <= n+1; i++){
            if(i % 2 == 0){
                sumEven += i;
            }else{
                sumOdd += i;
            }
        }
        System.out.println("Sum of even number: " + sumEven);
        System.out.println("Sum of odd number: " + sumOdd);
    }
}