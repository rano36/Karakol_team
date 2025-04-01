package gulayimCode;

public class MissingChar {
    //Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    //missingChar("kitten", 1) → "ktten"
    //missingChar("kitten", 0) → "itten"
    //missingChar("kitten", 4) → "kittn"

    // Метод для удаления символа по индексу из строки
    public String missingChar(String str, int n) {
        // Возвращаем строку, которая состоит из части до индекса n и после индекса n
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static void main(String[] args) {
        MissingChar obj = new MissingChar();

        System.out.println(obj.missingChar("kitten", 1)); // Вывод: "ktten"
        System.out.println(obj.missingChar("kitten", 0)); // Вывод: "itten"
        System.out.println(obj.missingChar("kitten", 4)); // Вывод: "kittn"
    }
}
