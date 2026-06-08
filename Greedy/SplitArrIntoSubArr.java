/**
 * Split the given array into K sub-arrays
 * We have an Array[] of N elements and a number K. (1<=K<=N). Split the given array into K sub arrays (they must cover all the elements). The maximum sub array sum achievable out of K subarrays formed must be the minimum possible. Find that possible subarray sum.
 * 
 * Sample Input 1: Array[] = {1, 1, 2}, K = 2
 * Sample Output 1: 2
 * 
 * Sample Input 2: Array[] = {1, 2, 3, 4}, K = 3
 * Sample Output 2: 4
 */

public class SplitArrIntoSubArr{
    public static int ans = 10000000;

    public static void solve(int a[], int n, int k, int index, int sum, int maxsum){
        if(k == 1){
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for(int i = index; i < n; i++){
                sum += a[i];
            }

            maxsum = Math.max(maxsum, sum);
            ans = Math.min(ans, maxsum);
            return;
        }

        sum = 0;
        for(int i = index; i < n; i++){
            sum += a[i];
            maxsum = Math.max(maxsum, sum);
            solve(a, n, k - 1, i+ 1, sum, maxsum);
        }
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        int k = 3;  //K divisions
        int n = 4;  //size of array
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans + "\n");
    }
}