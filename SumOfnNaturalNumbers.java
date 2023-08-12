package recursion;

public class SumOfnNaturalNumbers {
    public static int sumOfnNaturalNumbers(int num){
        if(num==1){
        return 1;

    }
    return num * sumOfnNaturalNumbers(num-1);
}
public static void method(int num,int sum){
    if(num==1){
        System.out.println(sum);
        return;

    }
    method(num-1, num+sum);
}

}

    
