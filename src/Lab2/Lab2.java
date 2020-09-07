//1.У Java існує три типи циклів:for,while,do while
//        for(початок;умова;крок){
//        тіло цикло
//        }
//
//        do{
//        тіло циклу
//        }while(condition);
//
//        while(condition){
//        тіло циклу
//        }
//2.Кожен із цих циклів можна зробити нескінченни:for(;;){
//        /* тіло циклу */
//        }
//
//        або
//        while(true){
//        /* тіло циклу */
//        }
//
//        або
//        while(1){
//        /* тіло циклу */
//        }
//
//        або
//        do{
//        /* тіло циклу */
//        }while(true)
//
// 3.Цикл do{
//        /* тіло циклу */
//        }while()завжди виконується хочаб раз.
// 4.BREAK використовується для переривання циклу,а CONTINUE для його продовження.

        package Lab2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) throws IOException {
        int z = 10, e = 8, a = 10;
        float min = (float) (-10.0 - 2.5 * 21.0);
        float max = (float) (5.0 + 1.2 * 21.0);
        float step = (float) (0.5 + 21.0 / 20.0);
        float x;
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(step);

        System.out.println("Цикл for:");

        for (x = min; x <= max; x = x + step) {

            met(z, e, a, x);
        }
        System.out.println();
        System.out.println("Цикл while:");
        x = min;
        while (x <= max) {
            met(z, e, a, x);
            x = x + step;
        }
    }


    private static void met(int z1, int e1, int a1, float x1) {

        double p1, p2, p3;
        p1 = Math.pow((z1 + Math.sqrt((z1 * x1))), 1.0 / 5);
        p2 = Math.pow(e1, x1) + Math.pow(a1, 5) * Math.atan(Math.tan(x1));
        p3 = p1 / p2;

        System.out.println("N= " + p3);
    }
}
