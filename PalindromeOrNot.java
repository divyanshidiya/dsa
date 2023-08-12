package recursion;

public class PalindromeOrNot {
    static boolean method(int num , int start, int end){
        if(start>=end){
            return true;
        }
        int digitStart=getDigitAt(num,start);
        int digitEnd=getDigitAt(num,end);

        if(digitStart !=digitEnd){
            return false;
        }
        return method(num, start+1, end-1);
    }
    static int getDigitAt(int num, int position){
        int divisor=(int)Math.pow(10, position);
        return(num/ divisor)%10;
    }
    public static void main(String[] args) {
        int number=14541;
        int numDigits=(int)Math.log10(number)+1; if (method(number, 0, numDigits - 1)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

    }
    
}
