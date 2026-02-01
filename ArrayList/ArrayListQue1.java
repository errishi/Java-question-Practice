
import java.util.ArrayList;

//Monotonic ArrayList(EASY) - An Arraylist is monotonic if it is either monotone increasing or monotone decreasing. An Arraylist nums is monotone increasing if for all i<=j, nums.get(i) <= nums.get(j).An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j). Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise
public class ArrayListQue1 {

    public static boolean Monotonic(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i+1)) {
                dec = false;
            }
            if (nums.get(i) > nums.get(i+1)) {
                inc = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //1, 2, 2, 3

        // nums.add(1);
        // nums.add(2);
        // nums.add(2);
        // nums.add(3);
        //6, 5, 4, 4
        // nums.add(6);
        // nums.add(5);
        // nums.add(4);
        // nums.add(4);
        //1, 3, 2
        nums.add(1);
        nums.add(3);
        nums.add(2);

        System.out.println(Monotonic(nums));
    }
}
