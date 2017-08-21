import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Task2005 {

    /*

    Заданы n целых чисел. Выведите индекс (позицию) первого из минимальных элементов последовательности. Элементы последовательности занумерованы от 1 слева направо.


    Входные данные
    В первой строке записано целое число n (1 ≤ n ≤ 10000). Вторая строка содержит последовательность целых чисел a1, a2,..., an (-10000 ≤ ai ≤ 10000).


    Выходные данные
    Выведите искомый индекс.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        StringTokenizer st;
        s = scanner.nextLine();
        st = new StringTokenizer(s," ");
        List<Integer> numbers = new ArrayList<>();
        while(st.hasMoreTokens()) numbers.add(Integer.parseInt(st.nextToken()));
        System.out.print(numbers.indexOf(Collections.min(numbers))+1);



    }
}
