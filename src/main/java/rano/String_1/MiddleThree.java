package rano.String_1;

public class MiddleThree {
    public String middleThree(String str) {
        if (str == null || str.length() < 3 || str.length() % 2 == 0) {
            throw new IllegalArgumentException("Строка должна быть нечетной длины и минимум из 3 символов.");
        }
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }
}