// Ques - Finish the following code so that it prints you have a fever if your temperature is above 100 and otherwise prints you don't have a fever.

public class ques_8{
    public static void main(String args[]){
        double temp = 103.5;

        String health = (temp > 100) ? "You have a fever." : "You don't have a fever.";
        System.out.println(health);
    }
}