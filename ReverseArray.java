package ArrayQuestions;
import java.io.*;


public class ReverseArray {
    static void reverseArray(int arr[], int start, int end){
        int temp;
        if(start>=end)
        return;

        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverseArray(arr, start+1, end-1);

    }
    
    static void printReverseArray(int arr[], int size){
        
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={45,67,98,89};
        printReverseArray(arr, 4);
        reverseArray(arr, 0, 3);
        System.out.println("reversed array is ");
        printReverseArray(arr, 4);
    }
}
