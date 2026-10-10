import java.util.Scanner;
public class Tribonachi {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 1;i<=n;i++){
            System.out.println( a+" ");
            int sum = a+b+c;
            a = b;
            b = c;
            c = sum;
        }
        scn.close();

    }
}
