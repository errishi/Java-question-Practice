//What will be the type of result in the following Java code?

public class ques_4{
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954f;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result); 
    }
}