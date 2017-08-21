import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Task2026 {

    /*

    Задан массив a. Требуется каждый его элемент заменить на ближайший справа больший. Результаты замен не влияют на другие, то есть считайте,
    что все замены производятся одновременно. Если справа нет большего элемента, то замените элемент на число 0.


    Входные данные
    В первой строке записано целое положительное число n (1 ≤ n ≤ 10000), где n — длина заданного массива.
    Вторая строка содержит последовательность a1, a2,..., an (1 ≤ ai ≤ 10000) — последовательность элементов заданного массива.


    Выходные данные
    Выведите все элементы массива после замен. Числа разделяйте пробелами.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList();
        scanner.nextLine();
        for (int i=0;i<n;i++)
           a.add(scanner.nextInt());

        for (int i=0; i<n; i++) {
            int maxVal = 0;
            for (int j = i + 1; j < n; j++) {
                if (a.get(j).intValue() > a.get(i).intValue()) {
                    maxVal = a.get(j).intValue();
                    break;
                }
            }
            a.set(i, maxVal);
        }

        for (int i=0;i<n; i++)
        System.out.print(a.get(i).intValue() + " ");


    }
}
