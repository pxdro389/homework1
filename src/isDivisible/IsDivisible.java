package isDivisible;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)

public class IsDivisible {
    public static void main(String[] args) {
        IsDivisible check = new IsDivisible();
        System.out.println(check.isDivisible(20, 10));
        System.out.println(check.isDivisible(50, 25));
        System.out.println(check.isDivisible(40, 12));
    }

    public boolean isDivisible(int a, int b) {
        if (b == 0) {
            return false;
        } else {
            return a % b == 0;
        }
    }
}