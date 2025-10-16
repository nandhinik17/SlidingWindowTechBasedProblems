import java.util.*;

public class FindMaxSumofSubArrayofFixedLength {
    public static void main(String[] args) {
     int arr[] = {2, 9, 31, -4,21, 7};
     int k=3;
     int wSum =0;
     int mSum=0;
     
     for(int i=0;i<k; i++){
       wSum = wSum + arr[i];
     }
mSum= wSum;
     for(int j=k; j<arr.length; j++){
       
       wSum = wSum + arr[j]-arr[j-k];
       if(wSum>mSum)
       {
         mSum= wSum;
       }
         
     }
   System.out.println("Max Value of Array for fixed length 3 was " + mSum);
  }
}
