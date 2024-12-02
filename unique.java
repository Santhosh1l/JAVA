public class unique {

    public static void main(String[] args) {
        int arr[]={2,3,4,6,6};
        boolean isduplicate;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            isduplicate=false;
            for(int j=i;j<arr.length;j++){
                if ((arr[i]==arr[j]) &&  (i!=j)){
                    isduplicate=true;

                    break;
                }
            } if (!isduplicate) {
                System.out.println(arr[i]);
                sum += arr[i];
            }
        }System.out.println("sum of unique element:"+sum);
    }
}


