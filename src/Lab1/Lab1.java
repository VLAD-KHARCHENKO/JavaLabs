//
//        Харченко Владислав (ІПЗ 18006Б)
//
//        1. Існують 2 основні види трансляції компіляція та інтерпритація
//        Компіляція - процесс переведення коду мови програмування(вихідного коду) у машинний код з його подальшим виконанням процессором.
//        Інтерпритація - процесс зчитування та виконання вихідного коду программою інтерпритатором.
//
//        2. Синтаксична помилка - помилка в символьному уявленні при написанні команди, приклад:
//        SUstem.oYt.println("Hello World!");
//
//        Симантична помилка - помилка в правильності смислового застосування команди, приклад:
//       if(1==1){
//        A=1;
//        }
//
//        3. За рахунок попередньої трансляції вихідного кода програми в універсальний код Java Virtual Machine з його подальшою компіляцією
//
//        4. Ідентифікатор — ім'я об'єкта програми (змінної, масиву, структури, функції тощо), що дозволяє звернутись до об'єкта; ознака, яка цілком визначає сутність, в наперед визначеному просторі.
//            Змінні мають декілька основних характеристик, а саме тип, ім'я і значення. Відповідно до цього формуються властивості, а саме властивість присвоєння, ініціалізації, порівняння змінних.
//          Ініціалізація — ряд дій, що передують виконанню програми, зокрема, встановлення програмних змінних в нуль, або надання їм інших початкових значень. Якщо у змінної не встановлене значення вона ініціалізується нулем за замовчуванням.
//        5.Вбудовані цілі типи Java: byte, short, int, long.
//
//   Розширення: int a=5, b=2;
//               double x = (double)a/b;
//   Звуження : int a=5, b=2;
//               short x = (short)a-b;

package Lab1;

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
