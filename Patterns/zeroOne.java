/*  Print the following pattern.
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
*/

public class zeroOne{
    public static void main(String args[]){

        for(int line = 1; line <= 5; line++){
            for(int star = 1; star <= line; star++){
                if((line + star)% 2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}