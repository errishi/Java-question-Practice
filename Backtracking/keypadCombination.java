public class keypadCombination{
    final static char[][] L = {{},{}, {'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public static void letterCombinations(String S){
        int len = S.length();
        if(len == 0){
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), S);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String S){
        if(pos == len){
            System.out.println(sb.toString());
        }
        else{
            char[] letters = L[Character.getNumericValue(S.charAt(pos))];
            for(int i = 0; i < letters.length; i++){
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), S);
            }
        }
    }
    public static void main(String[] args) {
        // letterCombinations("2");
        // letterCombinations("23");
        letterCombinations("");
    }
}