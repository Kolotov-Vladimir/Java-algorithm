//Формат входных данных.
//Дана строка длины , состоящая из строчных букв английского алфавита и цифр.
//Формат выходных данных
//Выведите YES, если она состоит ровно из одной буквы и одной цифры. В противном случае выведите NO.
//Пример 1
// Ввод
// hq
// Вывод
// NO
//Пример 2
// Ввод
// d2
// Вывод
// YES
//Пример 3
// Ввод
// 31
// Вывод
// NO
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg = sc.nextLine();
        String otv = "NO";
        int countNumber = 0;
        int countStr = 0;
        countNumber += asciiNumber(arg.charAt(0));
        countNumber += asciiNumber(arg.charAt(1));
        countStr += asciiStr(arg.charAt(0));
        countStr += asciiStr(arg.charAt(1));

        if (countNumber == 1 && countStr == 1) {
            otv = "YES";
        }
        System.out.println(otv);
    }
    public static int asciiNumber(int ascii) {
        if (ascii >= 48 && ascii <= 57) {
            return 1;
        } else return 0;
    }

    public static int asciiStr(int ascii) {
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
            return 1;
        } else return 0;
    }
}
