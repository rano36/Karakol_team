package rano.String_1;

public class NonStart {
    public String nonStart(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Строки не должны быть null.");
        }
        if (a.length() < 1 || b.length() < 1) {
            throw new IllegalArgumentException("Каждая строка должна содержать минимум 1 символ.");
        }
        return a.substring(1) + b.substring(1);
    }
}