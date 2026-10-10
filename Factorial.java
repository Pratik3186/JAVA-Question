import java.util.Scanner;
public class Factorial {
    public static int isFactorial(int num){
        if(num<0){
            System.out.println("Invalid Input");
        }
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }  
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = scn.nextInt();
        System.out.println("The Factorial of the " + num +" is " + isFactorial(num));
        scn.close();
    }  
}
