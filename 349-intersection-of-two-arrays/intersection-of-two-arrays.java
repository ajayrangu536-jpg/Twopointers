import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int[]temp= new int[Math.min(nums1.length,nums2.length)];
        int index =0;
      
        while(i<nums1.length && j<nums2.length){
            if(i>0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            if(j>0 && nums2[j]== nums2[j-1]){
                j++;
                continue;
            }
            
       
        if(nums1[i]<nums2[j]){
            i++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else{
            temp[index++]=nums1[i];
            i++;
            j++;

        }
        }
    return Arrays.copyOfRange(temp,0,index);
        
    }
}