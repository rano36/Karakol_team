package akylai.logic1;

public class FizzString {
    public String fizzString(String str) {
        String lowerStr = str.toLowerCase();
        if (lowerStr.startsWith("f") && lowerStr.endsWith("b")) {
            return "FizzBuzz";
        }
        if (lowerStr.startsWith("f")) {
            return "Fizz";
        }
        if (lowerStr.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }
}