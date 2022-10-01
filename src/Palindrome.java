// создание класса
public class Palindrome {
    public static void main(String[] args) {
        // создание основного метода main()
        for (int i = 0; i < args.length; i++) {
            // перебор аргументов для записи
            String s = args[i]; // запись аргументов в строку s
            String[] words = s.split("\\s"); // объявление массива слов
            // для того чтобы разделить слова в строке по пробелу("\\s")
            String w; // вспомогательная строка для записи слов по очереди
            // перебор записанных слов
            for (int j = 0; j < words.length; j++) {
                w = words[j]; // присвоение строке по одному слову из массива слов(String[] words)
                System.out.println(w + " " + reverseString(w) + " " +  isPalindrome(w)); // вывод результата
                }
            }
        }
        // создание метода для разворачивания слова по символьно
        public static String reverseString(String w) {
            String str; // создание вспомогательной строки
            str = ""; // пустая строка(str = null)
            for (int i = w.length() - 1; i != -1; i--) // перебор символов для записи развернутого слова в "w"
                // (w.length считает целое число символов начиная с "1")
                str += w.charAt(i); // добавление символов вo вспомогательную строку
            return str; // возврат строки
        }
    // метод сравнения слов
    public static boolean isPalindrome(String w) {
        // возвращает "true" только тогда, когда одинаковые(reverseString(w) и сама строка(w)
        // "оператор сравнения (.equals())" так же возвращает "false")
        return reverseString(w).equals(w);
    }
}
