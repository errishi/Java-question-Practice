/*print the number of 7's that are in the 2D array.
    input = int[][]array = {{4,7,8},{8,8,7}};
    output = 2
*/

public class ques_1{

    public static void searchNum(int arr[][]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Found " + count + " times");
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        searchNum(arr);
    }
}