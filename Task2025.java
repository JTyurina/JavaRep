import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.min;

public class Task2025 {

    /*

    Рассмотрим простой вариант задачи RMQ (Range Minimum Query, запрос минимума на подмассиве).

    Задан массив из n целых чисел (a1, a2,..., an) и m запросов вида (li, ri) (1 ≤ li ≤ ri ≤ n).
    Ваша задача — на каждый запрос вывести минимальный среди элементов с индексами от li до ri включительно.


    Входные данные
    В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве.
    Во второй строке через пробел записаны целые числа a1, a2,..., an (1 ≤ ai ≤ 100). В третьей строке входного файла дано число m (1 ≤ m ≤ 100) — количество запросов.
    Далее в m строках даны запросы по одному на строке в виде двух целых чисел li, ri, разделенных пробелом (1 ≤ li ≤ ri ≤ n).


    Выходные данные
    Выведите m чисел — ответы на запросы. Числа разделяйте пробелом или переводом строки. На запросы следуюет отвечать в том порядке, в котором они заданы во входных данных.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList arr = new ArrayList();

        for (int i=0; i<n; i ++)
            arr.add(scanner.nextInt());

        int m = scanner.nextInt();
        ArrayList arrMin = new ArrayList();
        while (scanner.hasNextLine() && arrMin.size()<m)
        {
            scanner.nextLine();
            int ind1 = scanner.nextInt();
            int ind2 = scanner.nextInt();
            if (ind1 == ind2)
                arrMin.add(arr.get(ind1-1));
            else
                arrMin.add(min(arr.subList(ind1 - 1, ind2))); // sublist не включает toIndex
        }

        System.out.println(arrMin);




    }



}
