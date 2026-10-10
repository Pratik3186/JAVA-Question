import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int num){
        if(num==1){return false;}
        for(int i=2;i<=num/2;i++){
            if(num%i==0){return false;}
        }return true;}
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int n = scn.nextInt();
        if(isPrime(n)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
        scn.close();
    }
    
}
