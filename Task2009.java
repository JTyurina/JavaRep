import java.io.IOException;
import java.util.Scanner;
import static java.lang.Integer.*;
import java.util.ArrayList;

public class Task2009 {

    /*
    Задана последовательность n целых чисел a1, a2,..., an. Выведите сумму всех ее элементов, стоящих на позициях, которые являются степенями двойки: 1, 2, 4, 8, 16 и т.д.

    Входные данные
    В первой строке задано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит последовательность целых чисел a1, a2,..., an.


    Выходные данные
    Выведите искомую сумму.
     */

    public static void main(String[] args) throws IOException {
        int a, n, sum;
        String s, s1;
        sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int  i = 0; i < n; i++)
            arr.add(scanner.nextInt());
        for (int i = 0;i<n; i++)
        {

            s = toBinaryString(i+1);
            s1 = s.replaceAll("0", "");
               if (s1.equals("1")) {
                    sum = sum + arr.get(i);
                }
        }

        if (arr.size() == 1)
            sum = arr.get(0);
        System.out.print(sum);

    }
}
