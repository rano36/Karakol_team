package gulayimCode.Warmup_1;

public class SumDouble {

    //    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//    sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumDouble obj = new SumDouble();
        System.out.println(obj.sumDouble(1, 2));
        System.out.println(obj.sumDouble(3, 2));
        System.out.println(obj.sumDouble(2, 2));
    }
}