import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        int a = 10, b = 20;
        int r = 15, y = 5;
        double x = -90.0, p1, p2, p3, p4, p5, p6, p7;
        double D;
        Scanner str = new Scanner(System.in);
        System.out.println("Введіть К ");
        int K = str.nextInt();

        p1 = Math.pow(K, (1 / (a * r * x)));
        p2 = a * Math.sqrt(6);
        p3 = Math.cos(3 * a * b);
        p4 = a * Math.asin(Math.sin(x));
        p5 = Math.log(y);
        p6 = Math.sin(p4 + p5);
        p7 = Math.pow(p6, 2);
        // p4 = Math.sin(a * Math.asin(x)+ Math.log(y));
        //p5=p4*p4;
        D = (p1 - p2 - p3) / p7;
        System.out.println("Результат обчислень: " + D);
        // System.out.println(p1);
        //System.out.println(p2);
        // System.out.println(p3);
        // System.out.println(p4);
        //   System.out.println(p5);
        // System.out.println(p6);
        //System.out.println(p7);

    }
}
