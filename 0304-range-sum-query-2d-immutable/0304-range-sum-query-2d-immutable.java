class NumMatrix {
    private int[][] arr;
    public NumMatrix(int[][] matrix) {
        arr=new int[matrix.length+1][matrix[0].length+1];

        for(int i=0 ; i<matrix.length ; i++){
            int sum=0;
            for(int j=0 ; j<matrix[i].length ; j++){
                sum+=matrix[i][j];
                arr[i+1][j+1]=sum;
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1+=1;
        col1+=1;
        row2+=1;
        col2+=1;
        int sum=0;
        for(int i=row1 ; i<=row2 ; i++){
            sum+=arr[i][col2] - arr[i][col1-1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */