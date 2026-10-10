import java.util.Scanner;
public class StrongNumber{
    public static long getFactorial(int n){
        if(n<1){
            System.out.println("Invalid Input");
        }
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;

    }
    public static boolean isStrong(int num){
        int temp = num;
        int sum = 0;
        while (temp>0){
            int rem = temp%10;
            sum += getFactorial(rem);
            temp = temp /10;
        }
        return sum == num;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int testNumber = scn.nextInt();
        if(isStrong(testNumber)){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong");
        }
        scn.close();
    }
}