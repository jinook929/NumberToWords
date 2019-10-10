public class Main {

    public static void main(String[] args) {

        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(0);

        System.out.println(NumberToWords.getDigitCount(0));
    }
}
