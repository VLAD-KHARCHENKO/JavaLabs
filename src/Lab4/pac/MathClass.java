package Lab4.pac;

import Lab4.Lab4;

public class MathClass {

    static float x;

    public void met(int z1, int e1, int a1, float x1) {

        double p1, p2, p3;
        p1 = Math.pow((z1 + Math.sqrt((z1 * x1))), 1.0 / 5);
        p2 = Math.pow(e1, x1) + Math.pow(a1, 5) * Math.atan(Math.tan(x1));
        p3 = p1 / p2;

        System.out.println("N= " + p3);
    }
}
