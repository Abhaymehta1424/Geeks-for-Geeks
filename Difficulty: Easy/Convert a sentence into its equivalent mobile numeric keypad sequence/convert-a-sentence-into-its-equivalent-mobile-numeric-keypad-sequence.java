// User function Template for Java
class Solution {
    String printSequence(String s) {
        // code here
        String[] arr={
            "2", "22", "222",
        "3", "33", "333",
        "4", "44", "444",
        "5", "55", "555",
        "6", "66", "666",
        "7", "77", "777","7777",
        "8", "88", "888",
        "9", "99","999", "9999"
        };
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                res+="0";
            }else{
                int index = s.charAt(i)-'A';
                res+=arr[index];
            }
        }
        return res;
    }
}