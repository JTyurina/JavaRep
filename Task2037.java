import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Task2037 {

    /*
    Дан текст, состоящий только из маленьких латинских букв и запятых. Последовательность подряд идущих букв, окруженную запятыми (началом, концом строки), назовем словом.
    Слово может быть пустым.

    Ваша задача — удалить из текста все слова короче k символов.


    Входные данные
    Первая строка входных данных — это текст, состоящий только из строчных латинских букв и запятых. Его длина не превосходит 1000 символов.
    На второй строке находится единственное число k — минимальная допустимая длина слова (0 ≤ k ≤ 1000).


    Выходные данные
    Выведите текст в таком же формате, как он задан — слова следует разделять запятыми.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList();
        String s = scanner.nextLine();
        String sCur = "";
        StringTokenizer st = new StringTokenizer(s,",");
        int n = scanner.nextInt();
        while (st.hasMoreTokens()) {
            sCur = st.nextToken();
            if (sCur.length() >= n)
                arr.add(sCur);
        }

        if ((st.countTokens() == 0) && n ==0)
            System.out.print(s);
        else {


            for (int i = 0; i < arr.size(); i++)
                if (i == (arr.size() - 1))
                    System.out.print(arr.get(i));
                else
                    System.out.print(arr.get(i) + ",");
            if (arr.size() == 0)
                System.out.print("");
        }
    }


    }

