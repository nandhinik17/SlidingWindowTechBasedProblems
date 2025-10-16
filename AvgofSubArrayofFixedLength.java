import java.util.*;

public class AvgofSubArrayofFixedLength {
    public static void main(String[] args) {
     int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
     float res[] = new float[5];
     int k=5;
     float wSum =0;
     int p =0;
     for(int i=0;i<k; i++){
       wSum = wSum + arr[i];
       
     }
     res[p++] = wSum/k;
    for(int j=k; j<arr.length; j++){
      wSum = wSum + arr[j]- arr[j-k];
      res[p++]=wSum/k;
    }
    System.out.println(Arrays.toString(res));
     
  }
}
