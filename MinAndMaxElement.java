package ArrayQuestions;
import java.util.Arrays;

class Pair{
    public int min;
    public int max;
}

public class MinAndMaxElement {
    static Pair getMinMax(int arr[], int n){
        Pair minmax=new Pair();
        Arrays.sort(arr);
        minmax.min= arr[0];
        minmax.max=arr[n-1];

        return minmax;
    }
     public static void main(String[] args) {
        int arr[]= {75,83,69,00,100};
        int arr_size=arr.length;
        Pair minmax=getMinMax(arr, arr_size);
        System.out.println(" minimum element is " + minmax.min);
        System.out.println(" maximum element is "  + minmax.max);
     }
}
