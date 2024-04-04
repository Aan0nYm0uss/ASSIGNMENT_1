package code;

public class Q7 {
    public static void main(String[] args) {
        int x =40;
        int y =90;
        int z;
        System.out.println
                ("Before sweeping the value x"+x+" and y is "+y);
        z = x;
        x = y;
        y = z;
        System.out.println("After sweeping the value x"+x+" and y is "+y);
    }
}
