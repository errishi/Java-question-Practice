/*Enter cost of 3 items from the user (using float datatype)-a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;

public class ques_3{
    public static void main(String args[]){
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil:");
        float pencil = scc.nextFloat();
        System.out.println("Enter the cost of pen:");
        float pen = scc.nextFloat();
        System.out.println("Enter the cost of an eraser:");
        float eraser = scc.nextFloat();
        
        float bill = pencil+pen+eraser;
        float billGst = (float)bill * 0.18f;
        float billTotal = bill + billGst;

        System.out.println("Net Payable Amount is:");
        System.out.println(billTotal);
    }
}