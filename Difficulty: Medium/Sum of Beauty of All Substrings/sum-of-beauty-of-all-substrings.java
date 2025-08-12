class Solution {
    public static int beautySum(String s) {
        int totalBeauty = 0;

        // Loop through all substrings
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int val : map.values()) {
                    max = Math.max(max, val);
                    min = Math.min(min, val);
                }

                totalBeauty += (max - min);
            }
        }

        return totalBeauty;
    }
}
