// In a program,input 3 numbers: A,B and C. You have to output the average of these 3
//numbers.(Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.*;

public class ques_1{
    public static void main(String args[]){
        Scanner scc = new Scanner(System.in);

        int a = scc.nextInt();
        int b = scc.nextInt();
        int c = scc.nextInt();

        float avg = (float)(a+b+c)/3;
        System.out.println("Average of three numbers are:");
        System.out.println(avg);
    }
}