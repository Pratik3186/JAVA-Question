import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int num) {
        if(num<1){
            return false;
        }
        int orignal = num;
        int temp = num;
        int reverse = 0;
        while(temp>0){
            int rem = temp%10;
            reverse = (reverse*10)+rem;
            temp=temp/10;
        }
        return reverse == orignal;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int n = scn.nextInt();
        if(isPalindrome(n)){
            System.out.println("The Number is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        scn.close();
}
}
