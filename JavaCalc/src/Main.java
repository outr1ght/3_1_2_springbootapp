import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] operator = new String[1];
    static ArrayList<Integer> digit = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Пожалуйста, напишите операцию с пробелами между знаками.");
        String operation = sc.nextLine();
        System.out.println("Результат операции: " + calc(operation));
        
    }

    public static String calc(String input) throws Exception {
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        String[] parts = input.split(" ");
        digits(parts);
        num1 = digit.get(0);
        num2 = digit.get(1);
        String strResult = Integer.toString(result);

        char op = operator[0].charAt(0);
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана, повторите ввод.");
        }
        return strResult = Integer.toString(result);
    }

    public static ArrayList<Integer> digits(String[] string) throws Exception {
        for (int i = 0; i < string.length; i++) {
            String s = string[i];
            if (isNumeric(string[i]))
                digit.add(Integer.parseInt(s));
            else operator[0] = string[i];
        }
        return digit;
    }

    public static boolean isNumeric(String string) throws Exception {
        int value;
        try {
            value = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        } return false;
    }

    public static int romanToArabic(String romanNumber) {
        int arabicNumber =

        return arabicNumber;
    }
}