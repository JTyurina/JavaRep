import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class Task2036 {

    /*

    Дан набор из n слов, состоящих из маленьких латинских букв.

    Будем называть слово странным, если в нем встречаются 3 или более гласные буквы подряд.

    Ваша задача — удалить из данного набора все странные слова.

    Гласными буквами в латинском алфавите считаются e,y,u,i,o,a.


    Входные данные
    В первой строке содержится число n — количество слов в наборе, n не превосходит 100. Далее в n строках по одному на строке содержатся слова из набора.
    Слова состоят только из маленьких латинских букв. Длина каждого слова не менее 1 и не более 20 символов.


    Выходные данные
    Выведите все слова из набора, не являющиеся странными. Каждое слово выводите на отдельной строке в том порядке, в котором они заданы во входных данных.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrVowels = new ArrayList();
        ArrayList<String> resultStr = new ArrayList();
        arrVowels.add("e");
        arrVowels.add("y");
        arrVowels.add("u");
        arrVowels.add("i");
        arrVowels.add("o");
        arrVowels.add("a");
        boolean weird = false;
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i< n; i++) {
            String s = scanner.nextLine();
            weird = false;
            String[] subStrArr = s.split("");
            for (int j=0; j< subStrArr.length-2; j++)
                if (arrVowels.contains(subStrArr[j]) && arrVowels.contains(subStrArr[j + 1]) && arrVowels.contains(subStrArr[j + 2])) {
                    weird = true;
                    break;
                }
            if (!weird)
                 resultStr.add(s);
        }


        for (int i = 0; i<resultStr.size(); i++)
            System.out.println(resultStr.get(i));

    }
}
