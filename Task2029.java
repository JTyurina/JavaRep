import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Task2029 {

    /*

    Задан массив из n чисел (a1, a2,..., an). Ваша задача — найти позицию среднего элемента среди минимальных в массиве.

    Обратите внимание, что если минимальных чисел в массиве четное количество, то средних элементов два. В этом случае нужно вывести минимальную позицию среди средних элементов.


    Входные данные
    В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве. Во второй строке через пробел записаны целые числа a1, a2,..., an (1 ≤ ai ≤ 100).


    Выходные данные
    Выведите единственное число — позицию среднего элемента среди минимальных в массиве.

     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> indList = new ArrayList();
        for (int i=0;i<n;i++)
            arr.add(scanner.nextInt());
        int minLoc = Collections.min(arr).intValue();


        for  (int  i = 0; i< arr.size(); i++)
            if (arr.get(i).equals(minLoc))
                indList.add(i);

        if (indList.size()%2 == 0) {
            int indResult = (indList.size()/2)-1;
            System.out.println(indList.get(indResult)+1);
        }
           else{
            int indResult = (indList.size()/2);
            System.out.println(indList.get(indResult)+1);
        }

    }
}
