import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Task2021 {

/*

Задан массив из n чисел (a1, a2,..., an).

С ним два раза повторяют следующую процедуру: одновременно все максимумы в массиве делят на два. Нечетные числа при делении на два следует округлять вниз. Ваша задача — вывести массив после этих действий.


Входные данные
В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве. Во второй строке через пробел записаны числа a1, a2,..., an (1 ≤ ai ≤ 100).


Выходные данные
Выведите массив после всех действий. Числа разделяйте пробелами.


*/

    public static void main(String[] args) {

    /*   File file = new File("C:\\Users\\TurUli\\IdeaProjects\\TasksАlgorithms\\src\\2021.txt");

        try (FileReader fr = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fr);
            int n1 = Integer.parseInt(br.readLine());
            ArrayList seq1 = new ArrayList(n1);
            String s1 = br.readLine();
            StringTokenizer sr = new StringTokenizer(s1, " ");
            for(int i=1; i<=n1; i++)
            {
                seq1.add(sr.nextToken());

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        Scanner scanner;
        int n;
        ArrayList seq;


        scanner = new Scanner(System.in);
         n = scanner.nextInt();


        scanner.nextLine();
        seq = new ArrayList(n);
        for(int i=1; i<=n; i++)
        {
            seq.add(scanner.nextInt());

        }

        for (int l=1; l<=2; l++) {

            Comparable max = Collections.max(seq);

            for (int j = 0; j < n; j++)
                if (seq.get(j) == max)
                    seq.set(j, ((int) max / 2));
        }


        System.out.print(seq);
    }

}





