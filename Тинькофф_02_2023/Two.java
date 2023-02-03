// Дана строка s, состоящая из строчных букв английского алфавита. 
// Разрешается один раз поменять два любых символа строки местами (однако разрешается и не менять строку).
// Возможно ли с помощью одного такого действия получить строку, являющуюся последовательной записью двух одинаковых строк?

// Формат входных данных
// Первая строка содержит число n — длину строки s. Вторая строка содержит строку s длины n, состоящую из строчных букв английского алфавита.

// Формат выходных данных
// Выведите YES, если возможно поменять два символа местами (или не сделать ничего), чтобы выполнилось требуемое условие, и NO в противном случае.
// Замечание
// В первом примере можно поменять местами второй и третий символ, в результате чего получится строка abaaba, являющаяся последовательной записью двух строк aba.  
//Пример 1
// Ввод
// 6
// aababa
// Вывод
// YES  
//Пример 2
// Ввод
// 5
// aaaaa
// Вывод
// NO  
//Пример 3
// Ввод
// 8
// aaaabbbb
// Вывод
// NO 

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg = sc.nextLine();
        int length = arg.length();
        if (length % 2 == 1) {
            System.out.println("NO");
        } else {
            int halfLength = length / 2;
            int count = 0;
            List<String> arr = Arrays.asList(arg.split(""));
            HashSet<String> temp = new HashSet<>();
            for (int i = 0; i < halfLength; i++) {
                if (count > 2) {
                    System.out.println("NO");
                }
                if (!arr.get(i).equals(arr.get(i + halfLength))) {
                    count += 1;
                    temp.add(arr.get(i));
                    temp.add(arr.get(i + halfLength));
                }
            }
            if (temp.isEmpty() || temp.size() == 2) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
