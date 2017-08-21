import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2027 {

    /*
    Задан массив из n чисел (a1, a2,..., an). На нем два раза осуществляют операцию переворота подмассива: первый раз с позиции l1 по r1, второй раз с позиции l2 по r2.

    При перевороте подмассива порядок элементов в нем меняется на обратный.

    Ваша задача — найти последовательность после осуществления переворотов.


    Входные данные
    В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве. Во второй строке через пробел записаны целые числа a1, a2,..., an (1 ≤ ai ≤ 100).
    В третьей строке записаны через пробел числа l1 и r1 (1 ≤ l1 ≤ r1 ≤ n), в четвертой — числа l2 и r2 (1 ≤ l2 ≤ r2 ≤ n).


    Выходные данные
    Выведите последовательность (a1, a2,..., an) после осуществления переворотов. Числа разделяйте пробелом.

     */

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<n; i++)
            arr.add(scanner.nextInt());
        scanner.nextLine();
        int l1 = scanner.nextInt()-1;
        int r1 = scanner.nextInt();
        scanner.nextLine();
        int l2 = scanner.nextInt()-1;
        int r2 = scanner.nextInt();
        // первый переворот
        List<Integer> arrTemp1 = arr.subList(l1,r1);
        Collections.reverse(arrTemp1);
        int indTemp = 0;
        for (int i=l1; i<r1; i++) {
            arr.set(i, arrTemp1.get(indTemp));
            indTemp += 1;
        }
        // второй переворот
        List<Integer> arrTemp2 = arr.subList(l2,r2);
        Collections.reverse(arrTemp2);
        indTemp = 0;
        for (int i=l2; i<r2; i++) {
            arr.set(i, arrTemp2.get(indTemp));
            indTemp += 1;
        }

        // вывод
        for (int i=0; i<n; i++)
        System.out.print(arr.get(i).intValue() + " ");





    }
}
