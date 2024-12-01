//This question is based on a trick, pleasedirectly look at the solution.Convert uppercase characters to lowercase using bits.

public class ques_4{
    public static void main(String[] args) {
        // convert uppercase character to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println((char)(ch | ' '));
        }
    }
}