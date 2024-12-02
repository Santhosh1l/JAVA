public class missing_single_no {
    public static void main(String[] args) {
        int arr[]={2,3,4,7};
        int n= arr.length;
        int asum=0;
        int sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            asum+=arr[i];
        }
        System.out.println(asum-sum);
    }
}
