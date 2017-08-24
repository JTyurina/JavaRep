import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Task2013 {

    /*
    2013. Количество минимумов

    ограничение времени на тест: 2 seconds
    ограничение памяти на тест: 64 megabytes
    ввод: standard
    вывод: standard



    Задана последовательность n целых чисел a1, a2,..., an. Выведите количество ее элементов, равных минимальному.


    Входные данные
    В первой строке записано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит последовательность n целых чисел a1, a2,..., an (-10000 ≤ ai ≤ 10000).


    Выходные данные
    Выведите искомое количество минимумов.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList();
        for (int i=0; i< n; i++)
            arr.add(scanner.nextInt());
        int min = Collections.min(arr);
        System.out.print(Collections.frequency(arr,min));



    }
}
