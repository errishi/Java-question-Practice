/*  Print the following pattern.
  * * * * *
  *       *
  *       *
  * * * * *  
*/

public class hollowRect{

        public static void hollow_rectangle(int totalRow , int totalColumn){
            for(int i = 1; i <= totalRow; i++){
                for(int j = 1; j <= totalColumn; j++){
                    if(i == 1 || i == totalRow || j == 1 || j == totalColumn){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
}