import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2003 {

    /*
    Альтернированной суммой заданной последовательности n чисел a1, a2,..., an называется число s=a1-a2+a3-a4+.... В альтернированной сумме знаки слагаемых чередуются,
    альтернация начинается со знака "+".

    По заданной последовательности целых чисел выведите ее альтернированную сумму.


    Входные данные
    В первой строке задано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит n целых чисел, каждое от 1 до 10000 включительно.


    Выходные данные
    Выведите искомую альтернированную сумму.
     */

    public static void main(String[] args) {
        int sum, step;
        String s;
        StringTokenizer st;
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine(); // Значение из первой строки нигде не используется
            sum = 0;
            step = 1;
            s = scanner.nextLine();
            st = new StringTokenizer(s, " ");
            while (st.hasMoreTokens()) {
                if ((step % 2) == 0)
                    sum = sum - Integer.parseInt(st.nextToken());
                else
                    sum = sum + Integer.parseInt(st.nextToken());
                step += 1;
            }
            System.out.print(sum);
        }
    }





}



