/*  Print the following pattern.
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

public class floydTri{
    public static void main(String args[]){
        int counter = 1;

        for(int line = 1; line <= 5; line++){
            for(int star = 1; star <= line; star++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}