package Lab7;

import java.io.*;
import java.util.Scanner;

public class Lab7_2 {
    public static void main(String[] args) throws IOException {
        int[][] array = new int[5][4];
        File input = new File("input.txt");
        File output = new File("output.txt");
        FileWriter writer;
        writer = new FileWriter(output);

        Scanner scanner = new Scanner(input);
        int b;
        int min = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                array[i][j] = Integer.parseInt(scanner.next());

            }

        }


        System.out.println("Двовимірний масив:");
        metPrint(array);
        for (b = 20; b >= 0; b = b - 1) {
            for (int m = 0; m < 4; m++) {
                if (array[m][2] > array[m + 1][2]) {
                    int temp = array[m][2];
                    array[m][2] = array[m + 1][2];
                    array[m + 1][2] = temp;

                }

            }
        }

        System.out.println();
        System.out.println("Оновлений масив:");
        metPrint(array);
        //мінімальний елемент
        for (int j = 0; j < 4; j++) {
            if (array[1][j] < array[1][min]) {
                min = j;
            }
        }
        System.out.println("\nМінімальний елемент другого рядка: " + array[1][min]);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                writer.write(" " + array[i][j]);

            }
            //writer.write("\n ");
        }
        writer.close();


    }

    public static void metPrint(int[][] array) {
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
