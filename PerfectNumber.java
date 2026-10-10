import java.util.Scanner;
public class PerfectNumber {
    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1;i<=num/2;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int num = scn.nextInt();

        if(num<0){
            System.out.println("Invalid Input");
        }
        if(isPerfect(num)){
            System.out.println("It is a Perfect Number");
        }else{
            System.out.println("It is not a perfect Number");
        }
        scn.close();

    }

    
}
