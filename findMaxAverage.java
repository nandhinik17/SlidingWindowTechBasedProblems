class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double wSum =0;
        int max =0;
        double maxAvg = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            wSum = wSum + nums[i];
        }
        double avg = wSum/k;
        if(avg>maxAvg){
            maxAvg = avg;
        }

        for(int j=k; j<nums.length; j++){

            wSum = wSum + nums[j]-nums[j-k];
            avg = wSum/k;
            if(avg>maxAvg){
            maxAvg = avg;
        }
        }
        return maxAvg;


    }
}
