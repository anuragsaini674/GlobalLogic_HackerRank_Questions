/*Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, where n is the size of the array A and returns the length of the largest subarray with 0 sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N). */

class GfG
{
    public int maxLen(int[] arr, int n) {
        int maxLength = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            
            if (prefixSum == 0) {
                maxLength = i + 1;
            } else if (prefixSumMap.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum));
            } else {
                prefixSumMap.put(prefixSum, i);
            }
        }
        
        return maxLength;
    }
}   