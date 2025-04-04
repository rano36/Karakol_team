package rano_branch.string_1.scrum_55;

public class NTwice {
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
