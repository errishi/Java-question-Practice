/*print out the sum of the numbers in the second row of the "nums" array.
    input = int[][]num = {{1,4,9},{11,4,3},{2,2,3}};
    output = 18
*/

public class ques_2{

    public static void arraySum(int num[][]){
        int sum = 0;
        for(int j = 0; j < num[0].length; j++){
            sum += num[1][j];
        }
        System.out.println("Sum is " + sum);
    }
    public static void main(String[] args) {
        int num[][] = {{1,4,9},{11,4,3},{2,2,3}};
        arraySum(num);
    }
}