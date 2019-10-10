public class NumberToWords {

    public static void numberToWords (int number) {

        int originalNumber = number;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int digit;
            number = reverse(number);

            while (number > 0) {
                digit = number % 10;
                if (digit == 0) {
                    System.out.print("Zero ");
                } else if (digit == 1) {
                    System.out.print("One ");
                } else if (digit == 2) {
                    System.out.print("Two ");
                } else if (digit == 3) {
                    System.out.print("Three ");
                } else if (digit == 4) {
                    System.out.print("Four ");
                } else if (digit == 5) {
                    System.out.print("Five ");
                } else if (digit == 6) {
                    System.out.print("Six ");
                } else if (digit == 7) {
                    System.out.print("Seven ");
                } else if (digit == 8) {
                    System.out.print("Eight ");
                } else {
                    System.out.print("Nine ");
                }
                number /= 10;
            }

            int digitCount = getDigitCount(originalNumber);
            int counter = getDigitCount(reverse(originalNumber));
            if (digitCount != counter) {
                int digitDiff = digitCount - counter;
                for (int i = 0; i < digitDiff; i++) {
                    System.out.print("Zero ");
                }
            }

            System.out.println(" ");

        }
    }

    public static int reverse (int number) {

        if (number < 0) {
            number *=-1;
            int digitCount = getDigitCount(number);
            int sum = 0;
            int power;

            while (number > 0) {
                for (int i = 0; i < digitCount; i++) {
                    power = digitCount -1 - i;
                    sum += ((number % 10) * Math.pow(10, power));
                    number /= 10;
                }
            }
            return -sum;
        }

        int digitCount = getDigitCount(number);
        int sum = 0;
        int power;

        while (number > 0) {
            for (int i = 0; i < digitCount; i++) {
                power = digitCount -1 - i;
                sum += ((number % 10) * Math.pow(10, power));
                number /= 10;
            }
        }

        return sum;
    }

    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int digitCount = 0;
        while (number > 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }
}
