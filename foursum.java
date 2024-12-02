import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class foursum {
    public static void main(String[] args) {


        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
         Set<List<Integer>> ans= new HashSet<>();
         for(int i=0;i< nums.length;i++){
             for(int j=i+1;j< nums.length;j++){
                 for(int k=j+1;k< nums.length;k++){
                     for(int l=k+1;l< nums.length;l++){
                         int sum= nums[i]+nums[j]+nums[k]+nums[l];
                         if(sum==target){
                             List<Integer> ss=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(ss);
                            ans.add(ss);

                         }
                     }
                 }
             }

         }
        System.out.println(ans
        );
    }
}