import java.util.Scanner;
public class ArmStrongNumber {
    public static int isCount(int n){
        int count  = 0;
        int temp = n;
        while(temp>0){
            count++;
            temp = temp /10;
        }
        return count;

    }
    public static int isPower(int base, int exp){
        int pow = 1;
        for(int i = 1;i<=exp;i++){
            pow = pow*base;
        }
        return pow;

    }
    public static boolean isAutomorphic(int n){
        int digit = isCount(n);
        int temp = n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum += isPower(rem, digit);
            temp = temp/10;
        }
        return sum == n;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int n = scn.nextInt();
        if(isAutomorphic(n)){
            System.out.println("ArmStrong it is");
        }else{
            System.out.println("No arm Strong");
        }
        scn.close();

    }
}
