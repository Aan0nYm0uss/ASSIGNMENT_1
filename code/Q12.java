package code;

import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextByte();
        int f = n%10;
        int s = (n/10)%10;
        int t = n/100;
        int sum = f+s+t;
        System.out.println("The sum of 3 integers in the numbers are :"+sum);
    }
}
