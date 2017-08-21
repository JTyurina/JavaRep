import java.util.Scanner;
import java.util.ArrayList;

public class Task2023 {

    /*
    Заданы два массива целых положительных чисел: a и b. Ваша задача сформировать такой массив c, содержащий все элементы массива a, которые встречаются в b.
    В массиве c элементы должны идти в том же порядке, что и a, просто пропускайте те элементы, что не присутствуют в b.

    Входные данные
    В первой строке записано целое положительное число n (1 ≤ n ≤ 10000), n — количество элементов массива a.
    Вторая строка содержит n целых чисел: a1, a2,..., an (1 ≤ ai ≤ 10000). Числа записаны через пробел.
    Третья и четвертая строки содержат описание массива b в формате, полностью совпадающем с форматом описания массива a.


    Выходные данные
    Выведите искомый массив c в формате, повторяющем формат массивов во входных данных. Если искомый массив пустой, то в первую строку выведите 0, а вторую оставьте пустой.

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arrA = new int[n];
        ArrayList arrC = new ArrayList();
        for (int i = 0; i<n; i++)
            arrA[i] = scanner.nextInt();
        scanner.nextLine();
        int m = scanner.nextInt();
        int[] arrB = new int[m];
        scanner.nextLine();
        for (int i = 0; i<m; i++)
            arrB[i] = scanner.nextInt();

        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++) {
                if (arrB[j] == arrA[i]) {
                    arrC.add(arrA[i]);
                    break;
                }
            }

        System.out.println(arrC.size());
        if (arrC.size() != 0)
            System.out.print(arrC);


    }


}
