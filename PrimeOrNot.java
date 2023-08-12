package recursion;

public class PrimeOrNot {
    static boolean method(int num, int divisor){
        if(num<=1 || num% divisor==0){
            return false;

        }
        if(num==2 || divisor*divisor> num){
            return true;
        }
        return method(num, divisor+1);

    }
    public static void main(String[] args) {
        int num = 17;
        if (method(num, num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    
}
