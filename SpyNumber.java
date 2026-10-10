import java.util.Scanner;
public class SpyNumber {
    public static boolean isSpy(int num){
        int sum = 0;
        int product = 1;
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            sum = sum + rem;
            product = product*rem;
            temp = temp /10; 
        }
        return sum == product;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int num = scn.nextInt();

        if(num<=0){
            System.out.println("Invalid Input");
        }else if(isSpy(num)){
            System.out.println("Spy Number");
        }else{
            System.out.println("Not a Spy Number");
        }
        scn.close();
    }
    
}
