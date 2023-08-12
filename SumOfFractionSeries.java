package recursion;

public class SumOfFractionSeries {

    static void method(int num, double sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        method(num-1, num/Math.pow(num, sum)+sum);
    }
     static double sumOfFractionSeries(int num){
        if(num==0){
            return 0;

        }
        return num/Math.pow(num, num)+sumOfFractionSeries(num-1);

     }
     public static void main(String[] args) {
        int num = 3;
    
        System.out.println("Using method method:");
        method(num, 0);
    
        System.out.println("\nUsing sumOfFractionSeries method:");
        double result = sumOfFractionSeries(num);
        System.out.println("Result: " + result);
    }
    
    
}
