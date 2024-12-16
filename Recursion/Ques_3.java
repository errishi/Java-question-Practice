/*Write a program to find Length of a String using Recursion.  */

public class Ques_3{
    public static int strLength(String str){
        if(str.length() == 0){
            return 0;
        }

        return strLength(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(strLength(str));
    }
}