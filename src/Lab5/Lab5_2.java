// 6 варіант
package Lab5;

public class Lab5_2 {
    public static void main(String[] args) {
        int[][] array = new int[5][4];
        int b;
        int min = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (1 + Math.random() * 100);
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
        for (int i = 0; i < 5; i++) {
            if (array[i][1] < array[min][1]) {
                min = i;
            }
        }
        System.out.println("\nМінімальний елемент другого рядка: " + array[min][1]);


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
