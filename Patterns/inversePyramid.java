/*  Print the following pattern.
        *
      * *
    * * *
  * * * * 
*/


public class inversePyramid{

    public static void pyramidPatterns(int number){
        //for line
        for(int i = 1; i <= number; i++){
            //for space
            for(int j = 1; j <= number-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramidPatterns(4);
    }
}