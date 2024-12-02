public class setmatrixzero{
    public static void main(String[] args) {
        int arr[][]= {{1,1,1},{1,0,1},{1,1,1}};
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] ans= zeromatrix(arr,rows,cols);
        System.out.println("after matrix zero");
        for(int i=0;i< rows;i++){
for(int j=0;j<cols;j++){
    System.out.print(ans[i][j]+" ");
}
            System.out.println();
        }

    }
    static int [][] zeromatrix(int[][]arr,int n,int m){
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(row[i]==1||col[j]==1){
            arr[i][j]=0;
        }
    }
}
        return arr;
    }
}