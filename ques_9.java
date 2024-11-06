// Write a java program to input week number (1-7) and print day of week name using switch case.
import java.util.*;

public class ques_9{
    public static void main(String args[]){
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scc.nextInt();
        switch(number){
            case 1 -> {
                System.out.println("Sunday");
            }
            case 2 -> {
                System.out.println("Monday");
            }
            case 3 -> {
                System.out.println("Tuesday");
            }
            case 4 -> {
                System.out.println("Wednesday");
            }
            case 5 -> {
                System.out.println("Thursday");
            }
            case 6 -> {
                System.out.println("Friday");
            }
            case 7 -> {
                System.out.println("Saturday");
            }
            default -> {
                System.out.println("invalid input!");
            }
        }
    }
}