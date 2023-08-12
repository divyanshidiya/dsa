package recursion;

public class ArmstrongNumberOrNot {
   static boolean armstrongOrNot(int num){
    int originalNumber=num;
    int numDigits=String.valueOf(num).length();
    int sumOfcubes=0;

    while(num!=0){
        int digit=num%10;
        sumOfcubes+= Math.pow(digit, numDigits);
        num/=10;
    }
    return sumOfcubes==originalNumber;
   }
    public static void main(String[] args) {
        int number=371;
        if(armstrongOrNot(number)){
            System.out.println(number + " is an armstrong number");
        }
        else{
            System.out.println(number + " is not an armstrong number");
        }
    }
}
