public class hollowRect{
    public static void main(String args[]){
        int n = 4;
        int m = 7;

        //for outer line
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= m; star++){
                if(line == 1 || line == n || star == 1 || star == m){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}