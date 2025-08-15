// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int ans = 0;
        int nums = n;
        while(n!=0){
            int t = n%10;
            ans += t*t*t;
            n/=10;
        }
        return ans == nums;
    }
}