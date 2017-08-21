import java.util.Scanner;

public class Task2001 {

/*
Заданы a и b. Выведите a+b.


Входные данные
В единственной строке входных данных заданы целочисленные a и b (1 ≤ a,b ≤ 1000).


Выходные данные
Выведите a+b.
 */

    public static void main(String[] args)
    {
        int a;
        int b;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        System.out.print(a+b);

    }

}
