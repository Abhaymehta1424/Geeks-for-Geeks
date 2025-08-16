class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Transposed matrix ka size hoga cols x rows
        for (int j = 0; j < cols; j++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                temp.add(mat[i][j]); // Transpose: mat[i][j] → ans[j][i]
            }
            ans.add(temp);
        }

        return ans;
    }
}