// QUes - Write a java program to get a number from user and print whether it is positive or negative.

import java.util.*;

public class ques_7{
    public static void main(String args[]){
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scc.nextInt();

        String status = (number >= 0) ? "Positive" : "Negative";
        System.out.println(status);
    }
}