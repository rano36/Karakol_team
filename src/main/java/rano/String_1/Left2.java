package rano.String_1;

public class Left2 {
    public String left2(String str) {
        if (str == null || str.length() < 2) {
            throw new IllegalArgumentException("Строка должна быть длиной минимум 2 символа.");
        }
        return str.substring(2) + str.substring(0, 2);
    }
}