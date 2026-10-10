import java.util.Scanner;
public class AutomorphicNumber {
    public static boolean isAutomorphic(int num){
        long square =(long) num*num;
        int temp = num;
        int divisor = 1;
        while(temp>0){
            divisor = divisor*10;
            temp/=10;
        }
        return (square%divisor) == num;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number to check:- ");
        int num = scn.nextInt();

        if(isAutomorphic(num)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scn.close();
    }
}
