class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;//To calculate size of sqaure matrix
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+mat[i][i];//sum of primary diagonal elements of matrix
            if(i!=n-i-1){//excluding taking sum of same element twice 
                sum=sum+mat[i][n-i-1];//sum of secondary diagonal elements of matrix
            }
        }
        return sum;
    }
}

