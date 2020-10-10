package Lab7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab7_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.dat");
        int a = 17;
        float b = 0;
        float[] array = new float[a];
        float[] arr = new float[a];
        ArrayList<Float> arrayList = new ArrayList<>();

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);
        writer.write(""+a);
        for (int i = 0; i < 17; i++) {
            array[i] = (float) ((-7) + Math.random() * 19.5);
            System.out.println(array[i]);
            writer.write(" " + array[i]);

        }

        writer.close();

        // Создание объекта FileReader
        // FileReader fr = new FileReader(file);
        Scanner scanner = new Scanner(file);
        float[] myInts = new float[50];
        int mySpot = 0;
       // int a1=scanner.nextInt();

        while (scanner.hasNext()) {
            myInts[mySpot] = Float.parseFloat(scanner.next());
            mySpot++;
        }
//        for (int i = 0; i < a; i++) {
//            System.out.println("   " + myInts[i]);
//
//
//        }

        for (int i = 0; i < array.length; i++) {
            if (myInts[i] > 0 && myInts[i] <= 5) {
                arrayList.add(array[i]);


            }
        }
        //підрахунок суми елдемапентів в проміжку
        for (float i : arrayList) {
            b = b + i;

        }

        System.out.println("------------------------------------");
        System.out.println("Елементи які попадають в проміжок (0 ; 5]");
        System.out.println(arrayList);
        System.out.println("------------------------------------");
        System.out.println("Кількість елементів");
        System.out.println(arrayList.size());
        System.out.println("------------------------------------");
        System.out.println("Сума елементів");
        System.out.println(b);

    }
}

