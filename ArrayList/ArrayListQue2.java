// Lonely Numbers in ArrayList (MEDIUM) - You are given an integer arraylist nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist. Return all lonely numbers in nums. You may return the answer in any order.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQue2{
    public static ArrayList<Integer> LonelyNum(ArrayList<Integer> nums){
        Collections.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 1; i < nums.size()-1; i++){
            if(nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)){
                ans.add(nums.get(i));
            }
        }

        if(nums.size() == 1){
            ans.add(nums.get(0));
        }
        if(nums.size() > 1){
            if(nums.get(0) + 1 < nums.get(1)){
                ans.add(nums.get(0));
            }
            if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)){
                ans.add(nums.get(nums.size()-1));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //10, 6, 5, 8

        // nums.add(10);
        // nums.add(6);
        // nums.add(5);
        // nums.add(8);

        //1, 3, 5, 3
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        System.out.println(LonelyNum(nums));
    }
}