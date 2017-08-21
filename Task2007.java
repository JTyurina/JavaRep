import java.util.Scanner;
import java.lang.String;



public class Task2007 {

    /*

    При записи в двоичной системе счисления число будет заканчиваться на 0, если оно является четным. Аналогично, число будет заканчиваться на два нуля, если оно делится на 4.

    В этой задаче вам надо определить "круглость" числа при записи в двоичной системе счисления, т.е. вам необходимо найти максимальную степень двойки, на которую эту число делится.

    Напишите программу, которая определяет на сколько нулей заканчивается двоичная запись заданного целого числа n.


    Входные данные
    В единственной строке записано целое число n (1 ≤ n ≤ 109).


    Выходные данные
    Выведите искомое количество нулей.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] sArr = (Integer.toBinaryString(n)).split("");
        int zeroAmount = 0;
        for (int i=sArr.length-1;i>=0;i--)
        {
            if (sArr[i].equals("0"))
                zeroAmount +=1;
            else
                break;

        }
        System.out.print(zeroAmount);





    }
}
