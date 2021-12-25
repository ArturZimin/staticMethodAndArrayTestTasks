package by.zimin;

public class Main {


    public static void main(String[] args) {
        MyStaticMethod ms = new MyStaticMethod();
        ms.toUsd(5000, 2.56);
        ms.toEuro(5000, 2.87);
        ms.usdToEuroOrEuroToUsd(100, true);

        ms.sumAllEventNumbers(1234);
        ms.countEventAndOddNumbers(123456);
        ms.reversNumber(123);
        ms.factorial(4);
        ms.countSimpleNumbersUpTo(20);
        ms.sumOfNumberAndMultiplyDigits(1234);
        ms.fibonacciUpTo(120);
        ms.raisingNumberToPower(2, 3);

        ms.multiplyTable(5);
        ms.deleteDigitFromNumber(123, 1);
        ms.sumFirstAndLast(12345);
        MyArrayMethod.arrayEventNumbers();
        MyArrayMethod.arrayOddNumbersUpTo99();
        MyArrayMethod.createArrayRandom();
        MyArrayMethod.arrayRandomNumbersOf8();
        MyArrayMethod.createTwoArraysFromFiveNumbers();
        MyArrayMethod.createArrAndCheckSequence();
        MyArrayMethod.createArrayFromTwentyNumbersFibonacci();
        MyArrayMethod.createArrIntNumbers12AndShowIndexMaxElem();


    }

}
