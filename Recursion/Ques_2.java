/*You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”. Use a recursive function to solve this problem.
NOTE- The digits of the number will only be in the range 0-9 and the lastdigit of a number can’t be 0.
Sample Input: 1947
Sample Output: “one nine four seven” */

public class Ques_2{
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void numToString(int num){
        if(num == 0){
            return;
        }

        int lastdigit = num % 10;
        numToString(num/10);
        System.out.print(digit[lastdigit] + " ");
    }
    public static void main(String[] args) {
        numToString(2019);
    }
}