package code;

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double da = s*40/100;
        double hra =s*20/100;
        double gross =s+da+hra;
        System.out.println("Da is :"+da);
        System.out.println("Hrs is :"+hra);
        System.out.println("Gross salary is :"+gross);
    }
}
