package ArrayQuestions;
import java.util.*;
public class ChocolateDistributionProblem {

    static int findMinDiff(int[] arr, int n, int m){
        if(m==0||n==0)
        return 0;

        Arrays.sort(arr);

        if(n<m)
        return -1;

        int min_diif=Integer.MAX_VALUE;

        for(int i=0;i+m-1<n ; i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<min_diif)
            min_diif=diff;
        }
        return min_diif;

    }

    public static void main(String[] args) {
        int arr[]={12,4,7,9,23,25,41,30,40,28,42,30,44,48,43,50};

        int m=7;
        int n=arr.length;
        System.out.println("minimum difference is "+ findMinDiff(arr, n, m ));
    }

    
}
