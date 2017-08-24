import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Task2042 {
 /*   2042. Строки. Поиск образца в тексте

    ограничение времени на тест: 2 seconds
    ограничение памяти на тест: 64 megabytes
    ввод: standard
    вывод: standard

    Дан текст, состоящий из строчных латинских букв, и шаблон, состоящий из строчных латинских букв и знаков вопроса. Знак вопроса может обозначить любую букву. Например, строки "abaca" и "??ac?" равны, а "aba" и "?c?" — нет.

    Ваша задача — вывести все позиции вхождения шаблона в текст.


            Входные данные
    В первой строке входных данных содержится текст, состоящий только из строчных латинских букв. Во второй строке содержится шаблон, состоящий из строчных латинских букв и знаков вопроса. Длины текста и шаблона не менее 1 и не более 1000 символов.


            Выходные данные
    Выведите все позиции вхождения шаблона в текст в возрастающем порядке. Числа разделяйте пробелами. Позиции в строке нумеруются с 1.
    */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String pat = scanner.nextLine().trim();

        while (pat.contains("?"))
         pat = pat.replace("?", "([a-z]{1})");
        int pos = 0;
        Pattern p = Pattern.compile(pat);
        ArrayList<Integer> arr = new ArrayList();
        Matcher m = p.matcher(s);
        while(m.find(pos)) {
            if (arr.contains(m.start() + 1) == false)
              arr.add(m.start() + 1);
            pos += 1;
        }

        for (int i = 0; i< arr.size(); i++)
            System.out.print(arr.get(i) + " ");


    }

}
