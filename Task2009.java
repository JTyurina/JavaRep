import java.util.Scanner;
import static java.lang.Integer.*;

public class Task2009 {

    /*
    Задана последовательность n целых чисел a1, a2,..., an. Выведите сумму всех ее элементов, стоящих на позициях, которые являются степенями двойки: 1, 2, 4, 8, 16 и т.д.

    Входные данные
    В первой строке задано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит последовательность целых чисел a1, a2,..., an.


    Выходные данные
    Выведите искомую сумму.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, sum;
        sum = 0;
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1;i<=n; i++)
        {
           a = scanner.nextInt();
           int sBin = parseInt(toBinaryString(i));
           String s = Integer.toString(sBin);
            if (s.replaceAll("0","").equals("1")){
               sum = sum + a;

           }
        }

        System.out.print(sum);

    }
}
