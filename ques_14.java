//Ques - Write a program to find the factorial of any number entered by the user.

import java.util.*;

public class ques_14{
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scc.nextInt();
        int factorial = 1;

        for(int i = 1; i < n+1; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}