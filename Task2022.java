import java.util.Scanner;

public class Task2022 {

    /*
    Задан массив n целых чисел (a1, a2,..., an). Ваша задача — найти количество пар индексов (i, j), что i ≠ j и ai делит aj. Обратите внимание, что пары (i, j) и (j, i) считаются различными.


Входные данные
В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве. Во второй строке через пробел записаны числа a1, a2,..., an (1 ≤ ai ≤ 100).


Выходные данные
Выведите единственное число — количество пар, удовлетворяющий условию.

     */

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        scanner.nextLine();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i=0; i<n; i++)
            for (int j=i+1; j<n; j++){
                if (arr[j]%arr[i] == 0) count += 1;
                 if (arr[i]%arr[j] == 0) count += 1;
        }

            System.out.println(count);





    }
}
