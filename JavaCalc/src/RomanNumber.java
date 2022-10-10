public enum RomanNumber {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    private RomanNumber romanNumber;
    private int arabicConversion;
    RomanNumber(int arabicConversion) {
        this.arabicConversion = arabicConversion;
    }

    public int getArabicConversion() {
        return arabicConversion;
    }

    public boolean isRoman(String string) {
        return string.equals(romanNumber);
    }

}
