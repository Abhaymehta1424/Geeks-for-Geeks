// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean snake = true;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0;i<row;i++){
            
            if(snake){
                for(int j=0;j<col;j++){
                    res.add(matrix[i][j]);
                }
            }else{
                for(int j=col-1;j>=0;j--){
                    res.add(matrix[i][j]);
                }
            }
            snake =! snake;
        }
        return res;
    }
}