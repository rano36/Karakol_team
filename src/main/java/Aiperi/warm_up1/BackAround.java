package Aiperi.warm_up1;

public class BackAround {
        public String backAround(String str) {
            String last = str.substring(str.length() - 1);
            return last + str + last;
        }
    }