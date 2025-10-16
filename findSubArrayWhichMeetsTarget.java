import java.util.*;

public class findSubArrayWhichMeetsTarget {
    public static void main(String[] args) {
     int arr[] = {12, 5, 31, 9, 21, 8};
      int start =0;
     int sum =0;
     int target = 45;
    
     
     for(int i=0; i<arr.length; i++){
       sum = sum+ arr[i];
       //sum=45, start=1, i=3
       if(sum> target && start<=i){
         sum = sum-arr[start];
         start++;
         //start=1, i=2;
       }
       if(sum==target){
         int p=0;
         System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, i+1)));
         return; 
         
       }
     }
     
    
     
  }
}
