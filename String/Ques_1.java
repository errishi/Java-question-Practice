/*Count how many times lowercase vowels occurred in a string entered by the user. */

import java.util.*;

public class Ques_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String userInput;
        System.out.println("Enter string:");
        userInput = sc.nextLine();
        
        for(int i = 0; i<userInput.length(); i++){
            char ch = userInput.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Count of vowels is :" + count);
    }
}