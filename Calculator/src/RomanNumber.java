import java.util.ArrayList;

public enum RomanNumber {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7),
    VIII(8), IX(9), X(10), XX(20), XXX(30), XL(40), L(50),
    LX (60), LXX(70), LXXX(80), XC(90), C(100);

    private RomanNumber romanNumber;
    private int arabicConversion;

    public RomanNumber getRomanNumber() {
        return romanNumber;
    }

    RomanNumber(int arabicConversion) {
        this.arabicConversion = arabicConversion;
    }

    public int getArabicConversion() {
        return arabicConversion;
    }


    public boolean isRoman(String string) {
        return romanNumber.equals(string.charAt(0));
    }


    public int romanToInt(String s) {
        int last = s.length() - 1;
        char[] array = s.toCharArray();
        int arabian, arabian1;
        RomanNumber res = RomanNumber.valueOf(String.valueOf(array[last]));
        int result = res.getArabicConversion();

        for (int i = last - 1; i >= 0 ; i--) {
            RomanNumber ar = RomanNumber.valueOf(String.valueOf(array[i]));
            RomanNumber ar1 = RomanNumber.valueOf(String.valueOf(array[i + 1]));
            arabian = ar.getArabicConversion();
            arabian1 = ar1.getArabicConversion();

            if (arabian < arabian1) {
                result -= arabian;
            } else {
                result += arabian;
            }
        }
        return result;
    }


    public static boolean contains(String test) {

        for (RomanNumber c : RomanNumber.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }

        return false;
    }

    public static String intToRoman1(int number) {
        RomanNumber[] rnArray = RomanNumber.values();
        ArrayList<RomanNumber> rnList = new ArrayList<>();
        for (int i = 0; i < rnArray.length; i++) {
            rnList.add(rnArray[i]);
        }

        int roundNumber = number;
        if (number > 10){
            roundNumber = (number / 10) * 10;
        }
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < rnList.size(); i++) {
            RomanNumber rn = RomanNumber.valueOf(String.valueOf(rnList.get(i)));
            values.add(Integer.parseInt(String.valueOf(rn)));
        }
        String roman = "";


        /*do {
            for (int i = 0; i < rnList.size(); i++) {


                if (rnList.get(i).equals()) {
                    roman += rnList.get(i).toString();
                    number -= roundNumber;
                }
            }

        } while (number != 0);*/
        return roman;
    }

}