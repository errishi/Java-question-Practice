// Write a java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;

public class ques_11{
    public static void main(String args[]){
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scc.nextInt();
        
        boolean x = (year % 4) == 0;
        boolean y = (year % 400) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0)); 

        if(x && (y||z)){
            System.out.println(year+ " is a leap year");
        }
        else{
            System.out.println(year+ " is not a leap year");
        }
    }
}