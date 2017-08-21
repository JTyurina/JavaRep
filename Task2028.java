

import java.util.*;

public class Task2028 {
    /*
    Задан массив из n целых чисел (a1, a2,..., an). Каждое число равно или 0, или 1, или 2, или 3, или 4. Ваша задача — подсчитать сколько каких чисел встречается в массиве.


    Входные данные
    В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве. Во второй строке через пробел записаны числа a1, a2,..., an (0 ≤ ai ≤ 4).


    Выходные данные
    Выведите в выходной файл все пары вида (x, cntx), где x — значение, cntx — сколько раз оно встречается в массиве. Числа в паре разделяйте пробелом,
     каждую пару выводите на отдельной строке, причем, пары выводите в порядке возрастания x. Не выводите пару, если cntx равно 0.


     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList arr = new ArrayList();
        for (int i=0;i<n;i++)
            arr.add(scanner.nextInt());
        int freq1 = Collections.frequency(arr,1);
        int freq2 = Collections.frequency(arr,2);
        int freq3 = Collections.frequency(arr,3);
        int freq4 = Collections.frequency(arr,4);
        if (freq1 > 0)
        System.out.println("(" + 1 + "," + freq1 + ")");
        if (freq2 > 0)
            System.out.println("(" + 2 + "," + freq2 + ")");
        if (freq3 > 0)
            System.out.println("(" + 3 + "," + freq3 + ")");
        if (freq4 > 0)
            System.out.println("(" + 4 + "," + freq4 + ")");



    }
}
