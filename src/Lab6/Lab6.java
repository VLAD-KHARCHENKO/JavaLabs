//6
package Lab6;

import java.util.ArrayList;

public class Lab6 {
    public static void main(String[] args) {
        String a = "Кохайтесь чорноброві та не з москалями";
        String str[] = a.split(" ");
        int size = 0;
        int b = 0;
      float midle = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int c = str.length;

        for (String s : str)
            arrayList.add(s.length());

        for (int v : arrayList)
            b = b + v;

        midle =(float) b / c;
        System.out.println("Середня довжина слова в рядку " + midle);
       // System.out.println(c);
        //System.out.println(b);
    }
}
