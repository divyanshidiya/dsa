package ArrayQuestions;

public class MaxSubarray {
    public int maxSubArray(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<n ;i++){
            sum+= arr[i];

            max=Math.max(sum,max);

            if(sum<0)  sum=0;
        }

        return max;

    }
}
