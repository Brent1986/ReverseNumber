public class ReverseNumber {
    public static void main(String[] args) {
        numberToWords(10);
    }
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int numDigit = getDigitCount(number);
        number = reverse(number);
        //System.out.println("number =" + number + " digits = " + numDigit);
        if (number == 0){
            System.out.println("Zero");
        } else {
            while (number > 0 || numDigit >0) {
                int theRem = number % 10;
                //System.out.println("theRem = " + theRem);
                number /= 10;
                numDigit --;
                if (theRem<=0 && numDigit >0) {
                    System.out.println("Zero");
                } else {
                    switch (theRem) {
                        case 0:
                            System.out.println("Zero");
                            continue;
                        case 1:
                            System.out.println("One");
                            continue;
                        case 2:
                            System.out.println("Two");
                            continue;
                        case 3:
                            System.out.println("Three");
                            continue;
                        case 4:
                            System.out.println("Four");
                            continue;
                        case 5:
                            System.out.println("Five");
                            continue;
                        case 6:
                            System.out.println("Six");
                            continue;
                        case 7:
                            System.out.println("Seven");
                            continue;
                        case 8:
                            System.out.println("Eight");
                            continue;
                        case 9:
                            System.out.println("Nine");
                            continue;
                    }
                }
            }
        }
    }
    public static int reverse (int number){
        int theResult = 0;
        boolean isNegative = false;
        if (number < 0) isNegative = true;
        if (isNegative) number *= (-1);
        int thePower = getDigitCount(number);

        while (number > 0){
            int theRem = number % 10;
            number /= 10;
            //System.out.println("theRem = " + theRem );
            if (thePower > 1){
                double mathTen = Math.pow(10,thePower -1);
                theRem = (int)(theRem * mathTen);
            }
            theResult = theResult + theRem;
            thePower --;
        }
        if (isNegative) theResult *= (-1);
        //System.out.println("The reverse = " + theResult);
        return theResult;
    }
    public static int getDigitCount(int number){
        if (number < 0) return -1;
        if (number == 0) return 1;
        int tenPower = 0;
        while (number > 0){
            number /= 10;
            tenPower ++;
        }
        //System.out.println("numer of digits = " + tenPower);
        return tenPower;
    }
}
