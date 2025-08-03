// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long nums[]) {
        long res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                long total = nums[i] + nums[j] + nums[k];
                if(total < sum){
                    res +=(k-j);
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }
}
