package code;

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km:");
        double km = sc.nextDouble();
        double meter = km*1000;
        double cm = km*10000;
        double feet = km*3280.8399;
        double inch =km*39370.0787;
        System.out.println(km+" is "+meter+" meter");
        System.out.println(km+ " is "+cm+" Centimeter");
        System.out.println(km+ "is "+feet+" feet");
        System.out.println(km+" is "+inch+" inch");
    }
}
