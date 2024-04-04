package code;

import java.util.Scanner;
public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        double t = sc.nextInt();
        double g = 32.174;
        double d =  1.0/2*g*t*t;
        System.out.println("The distance travel : "+d);
    }
}
