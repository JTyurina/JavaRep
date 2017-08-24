import java.util.Scanner;
import java.util.ArrayList;
public class Task2015 {

    /*

    Простое число — это натуральное число, которое имеет ровно два различных натуральных делителя: единицу и самого себя. Последовательность простых чисел начинается так: 2, 3, 5, 7, 11, 13, 17, 19, 23,...

    Напишите программу, которая выведет все простые числа на отрезке [1,n] в порядке возрастания.


    Входные данные
    В единственной строке входных данных записано целое число n (1 ≤ n ≤ 10000).


    Выходные данные
    Выведите все простые числа на отрезке [1,n] по возрастанию по одному в строке.
     */
    public static boolean isSimple(int n)
    {
        boolean result = true;
        for (int i=2; i<n; i++)
        {
            if (n%i == 0) {
                result =  false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList();
        int n = scanner.nextInt();
        for (int i = 2; i<=n; i++)
            if (isSimple(i))
                arr.add(i);

        for (int j=0; j< arr.size(); j++)
            System.out.println(arr.get(j));

    }

}
