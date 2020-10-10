package Lab5;


import java.util.ArrayList;

public class Lab5_1 {
    public static void main(String[] args) {
        float a = 0;
        float[] array = new float[17];
        ArrayList<Float> arrayList = new ArrayList<>();

        for (int i = 0; i < 17; i++) {
            array[i] = (float) ((-7) + Math.random() * 19.5);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0 && array[i] <= 5) {
                arrayList.add(array[i]);


            }}
        //підрахунок суми елдемапентів в проміжку
        for (float i : arrayList) {
               a = a + i;

        }

        System.out.println("------------------------------------");
        System.out.println("Елементи які попадають в проміжок (0 ; 5]");
        System.out.println(arrayList);
        System.out.println("------------------------------------");
        System.out.println("Кількість елементів");
        System.out.println(arrayList.size());
        System.out.println("------------------------------------");
        System.out.println("Сума елементів");
        System.out.println(a);

    }


}



