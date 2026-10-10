import java.util.Scanner;
public class Fibonachi{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scn.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i<= n;i++){
            System.out.println(a+" ");

            int sum = a+b;
            a = b;
            b = sum;
        }
        scn.close();
    }
}