package recursion;

public class CountNumberOfZeroes {
    public static int countNumberOfZeroes(int num){
        if(num==0){
            return 0;
        }
        if(num%10==0){
            return 1+countNumberOfZeroes(num/10);
        }
        return countNumberOfZeroes(num/10);
    }
    static void method(int num , int count){
        if(num==0){
            System.out.println(count);
            return;
        }
        if(num%10==0){
            count++;
        }
        method(num/10, count);
    }
    public static void main(String[] args) {
        int num = 102040;
        
        System.out.println("Using countNumberOfZeroes method: " + countNumberOfZeroes(num));
        
        System.out.print("Using method method: ");
        method(num, 0);
    }
    

    
}
