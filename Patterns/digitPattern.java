/*  Print the following pattern.
 1 2 4 4 5
 1 2 3 4
 1 2 3
 1 2
 1
*/

public class digitPattern{
    public static void main(String args[]){
        for(int line = 5; line >= 1; line--){
            for(int star = 1; star <= line; star++){
                System.out.print(star + " ");
            }
            System.out.println();
        }
    }
}