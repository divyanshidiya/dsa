package recursion;

public class PowerOfNumber {

    public static int powerOfNumber(int num, int power){
        if(power==0){
            return 1;
        }
        return num*powerOfNumber(num, power-1);
    }

    static void method(int num, int power, int result){
        if(power==1){
        System.out.println(num);
        return;
        }
        method(num, power-1, result*num);
    }
    
}
