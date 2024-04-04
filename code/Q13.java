package code;

import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = Math.PI * (3 * r * r);
        double v = Math.PI * (3/2 * r * r *r);
        System.out.println("The surface area of the hemisphere is :"+h);
        System.out.println("The volume of the hemisphere is :"+v);
    }
}