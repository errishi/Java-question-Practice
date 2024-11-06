/*In a program, in put the side of a square.You have to output the area of the square.(Hint : area of a square is (side x side)) */

import java.util.*;

public class ques_2{
    public static void main(String args[]){
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter side of Square:");
        float side = scc.nextFloat();
        float area = (float) side*side;
        System.out.println("Area of Square:");
        System.out.println(area);
    }
}