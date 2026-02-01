
import java.util.ArrayList;

//Beautiful ArrayList (MEDIUM) - An Arraylist nums of size n is beautiful if:nums is a permutation of the integers in the range [1, n]. For every 0 <= i < j < n,there is no index k with i < k < j where 2*nums.get(k) == nums.get(i) + nums.get(j). Given the integer n, return any beautiful arraylist nums of size n. There will be atleast one valid answer for the given  n.

public class ArrayListQue4{

    // Approach 1:
    // public static ArrayList<Integer> BeautyArrayList(int n){
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     ans.add(1);

    //     for(int i = 2; i < n; i++){
    //         ArrayList<Integer> temp = new ArrayList<>();

    //         for(Integer e: ans){
    //             if(2*e <= n) temp.add(e*2);
    //         }
    //         for(Integer e: ans){
    //             if(2*e-1 <= n) temp.add(e*2-1);
    //         }
    //         ans = temp;
    //     }
    //     return ans;
    // }

    // Approach 2:
    public static ArrayList<Integer> BeautyArrayList(int n){
        ArrayList<Integer> res = new ArrayList<>();

        divideConque(1, 1, res, n);
        return res;
    }

    private static void divideConque(int start, int increment, ArrayList<Integer> res, int n){
        if(start + increment > n){
            res.add(start);
            return;
        }

        divideConque(start, increment * 2, res, n);
        divideConque(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("result : " + BeautyArrayList(n));
    }
}