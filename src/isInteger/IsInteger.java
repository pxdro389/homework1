package isInteger;

public class IsInteger {

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//

    public static void main(String[] args) {
        IsInteger check = new IsInteger();

        System.out.println(check.isInteger("Comp"));
        System.out.println(check.isInteger("282"));
        System.out.println(check.isInteger("123"));
    }
    public boolean isInteger(String input) {
        if (input == null) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}