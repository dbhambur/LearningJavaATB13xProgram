package ex_04_operators;

public class Lab056_Interview {
    public static void main(String[] args) {

        short s = 10;
        char c = 'A'; // CHAR 'A' will always give the ASCII Value when adding with another value

        String S1 = "A"; // NOTE: we cannot add character with string becuase conatin double quote ("")

        System.out.println(c+S1);
        System.out.println(s+c);
        System.out.println(c); // when it is alone , it acts as a character

        System.out.println(c+c);


    }
}
