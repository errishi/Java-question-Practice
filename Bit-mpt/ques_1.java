//What is the value of x^x for any valueof x?

public class ques_1{
    public static int expoNum(int n){
        int ans = 1;
        int power = n;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * power;
            }
            power = power * power;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(expoNum(8));
    }
}