package gulayimCode;

public class FrontBack {
    /*Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"*/
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);

    }

    public static void main(String[] args) {
        FrontBack obj = new FrontBack();
        System.out.println(obj.frontBack("code"));
        System.out.println(obj.frontBack("a"));
        System.out.println(obj.frontBack("ba"));
    }
}
