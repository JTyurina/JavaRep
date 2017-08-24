import java.util.Scanner;

public class Task2012 {

    /*
    2012. Разрезание квадрата

ограничение времени на тест: 2 seconds
ограничение памяти на тест: 64 megabytes
ввод: standard
вывод: standard



    Верно ли, что два заданных прямоугольника a1 x b1 и a2 x b2 были получены разрезанием некоторого квадрата одним прямолинейным разрезом? Напишите программу, которая выведет YES или NO.


    Входные данные
    В первой строке заданы числа целые a1, b1 (1 ≤ a1,b1 ≤ 1000), во второй — числа целые a2, b2 (1 ≤ a2,b2 ≤ 1000). Числа в строках заданы через пробел.


    Выходные данные
    Выведите YES или NO.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        scanner.nextLine();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();


        if ( ((a1+a2 ==b1) && (b1==b2)) || ((a1+b2==b1)&&(b1==a2)) ||((b1+a2==a1)&&(a1==b2)) ||((b1+b2==a1)&&(a1==a2)))
            System.out.print("YES");
        else
            System.out.print("NO");



    }
}
