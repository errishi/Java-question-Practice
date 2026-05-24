
import java.util.*;
import java.io.*;

// Trapping Rain Water
// We have an array of N non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining. 
// Note : We have already solved this Question using Arrays but you have to now solve this using a Stack.

// Sample Input 1:[7 0 4 2 5 0 6 4 0 6]
// Sample Output 1: 25


public class TrappingRainWater{
    public static int maxWater(int[] height){
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            while((!stack.isEmpty()) && (height[stack.peek()] < height[i])){
                int pop_height = height[stack.peek()];
                stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int distance = i - stack.peek() - 1;
                int min_height = Math.min(height[stack.peek()], height[i]) - pop_height;
                ans += distance * min_height;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(maxWater(arr));
    }
}