package code;

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempreture in Fharenhite");
        double f =sc.nextDouble();
        double c =(f-32)*5/9;
        System.out.println(f+" is "+c+" Celcious");

    }
}
