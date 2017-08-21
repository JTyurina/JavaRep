import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2002 {


    /*
    Задано n целых чисел. Выведите их сумму.


    Входные данные
    В первой строке задано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит n целых чисел, каждое от 1 до 10000, включительно.


    Выходные данные
    Выведите искомую сумму.
     */

    public static void main(String[] args) {
        int n, sum;
        String s, s1;
        StringTokenizer st;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            sum = n;
            s1 = scanner.nextLine(); // считывание до конца первой строки
            s = scanner.nextLine();
            st = new StringTokenizer(s, " ");
            while (st.hasMoreTokens()) sum = sum + Integer.parseInt(st.nextToken());
            System.out.print(sum);
        }
    }
}
