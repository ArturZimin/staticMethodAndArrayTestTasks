package by.zimin;

import java.math.BigDecimal;

public class MyStaticMethod {

    private final double bynUsd = 0.3949;
    private final double eurUsd = 1.13;
    private final double eurByn = 2.8683;
    private final double bynRub = 29.0901;


    /**
     * 1.	Создать метод, toUSD(int byr, double course), переводящий бел.рубли в доллары по заданному курсу.
     * Вызовите его дважды в методе main() c любыми параметрами, результат напечатейте в консоль.
     */
    public BigDecimal toUsd(int byn, double course) {
        BigDecimal usd = new BigDecimal((double) byn / course);
        System.out.printf(byn + " to Usd= " + "%.4f", usd);
        System.out.println("\n");
        return usd;
    }

    /**
     * 2.	Создать метод toEuro (int byr, double course) , переводящий бел.рубли в евро по заданному курсу.
     * Вызовите его дважды в методе main() c любыми параметрами, результат напечатайте в консоль.
     */

    public BigDecimal toEuro(int byn, double course) {
        BigDecimal euro = new BigDecimal((double) byn / this.eurByn);
        System.out.printf(byn + " to Euro= " + "%.4f", euro);
        System.out.println("\n");
        return euro;
    }

    /**
     * 3.	По подобию создать методы конверсии двух валют из Euro в USD и наоборот.
     * И протестировать их в методе main().
     */
    public BigDecimal usdToEuroOrEuroToUsd(double currency, boolean usdTrue) {
        BigDecimal euro = new BigDecimal(currency / this.eurUsd);
        BigDecimal dollar = new BigDecimal(currency * this.eurUsd);
        if (usdTrue == true) {
            System.out.println(currency + " = " + dollar + " USD");
            return dollar;
        } else {
            System.out.println(currency + " = " + euro + " EUR");
            return euro;

        }

    }

    /**
     * 4.	Реализуйте методы исходя из их названий и типов.
     */

    public static void printKmToMiles(int km) {
        double kmToMiles = 0.621371;
        double miles = km * kmToMiles;
        System.out.println("Kilometers " + km + " = " + miles + " miles");
    }

    public static double kmToMiles(int km) {
        double kmToMiles = 0.621371;
        double miles = km * kmToMiles;
        return miles;
    }

    public static void printTrianglePerimeter(int a, int b, int c) {
        System.out.println("Perimeter triangle =" + (a + b + c));
    }

    public static double getTriangleArea(int heightCm, int widthCm) {
        double triangleArea = (heightCm * widthCm) / 2;
        return triangleArea;
    }

    public static void printSomethingSeveralTimes(String something, int times) {

        while (times > 0) {
            System.out.println(something);
            times--;
        }
    }

    /**
     * 5.	Реализуйте методы исходя из заданий (каждое задание – отдельный метод, который может что-то
     * вернуть с пом return, а может не возвращать void)
     * a)	Найти сумму четных цифр числа
     */

    public int sumAllEventNumbers(int number) {
        int sumEventNumbersOfNumbers = 0;
        int remainderAfterDivision;
        while (number > 0) {
            remainderAfterDivision = number % 10;
            if (remainderAfterDivision % 2 == 0) {
                sumEventNumbersOfNumbers += remainderAfterDivision;
            }
            number /= 10;
        }
        System.out.println("The sum of event numbers = " + sumEventNumbersOfNumbers);
        return sumEventNumbersOfNumbers;
    }

    /**
     * b)	Посчитать четные и нечетные цифры числа
     */

    public static String countEventAndOddNumbers(int number) {
        int odd = 0;
        int event = 0;
        int remainderAfterDivision;
        while (number > 0) {
            remainderAfterDivision = number % 10;
            if (remainderAfterDivision % 2 == 0) {
                event++;
            } else {
                odd++;
            }
            number /= 10;
        }
        String a = "Event count= " + event + ", odd= " + odd;
        System.out.println(a);
        return a;

    }

    /**
     * c)	"Переворот" числа
     */
    public int reversNumber(int n) {
        int rev = 0;
        int remOfDiv = 0;
        while (n > 0) {
            remOfDiv = n % 10;
            rev = (rev + remOfDiv) * 10;
            n /= 10;
        }
        rev = rev / 10;
        System.out.println(" Revers: " + rev);
        return rev;
    }

    /**
     * d)	Вычисление факториала числа
     */
    public int factorial(int n) {
        int factorial = 1;
        if (n == 1) {
            System.out.println(factorial);
            return factorial;
        } else if (n == 2) {
            factorial = 2;
            System.out.println(factorial);
            return factorial;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println((factorial));
            return (factorial);
        }
    }

    /**
     * e)	Определить количество простых чисел
     */
    public int countSimpleNumbersUpTo(int n) {
        int countPrimeNum = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                countPrimeNum++;
            }
        }
        System.out.println("Count prime numbers= " + countPrimeNum);
        return countPrimeNum;
    }

    /**
     * f)	Сумма и произведение цифр числа
     */

    public String sumOfNumberAndMultiplyDigits(int number) {
        int count = 0;
        int sum = 0;
        int multiplySum = 0;
        int remainderAfterDivision;
        while (number > 0) {
            remainderAfterDivision = number % 10;
            if (count < 1) {
                multiplySum = remainderAfterDivision;
                count++;
            } else {
                multiplySum *= remainderAfterDivision;

            }
            sum += remainderAfterDivision;

            number /= 10;
        }
        String a = "The sum of number = " + sum + "  The sum after multiplying the digits of  the number  = " + multiplySum;
        System.out.println(a);
        return a;
    }

    /**
     * g)	Числа Фибоначчи
     */
    public void fibonacciUpTo(int digit) {
        long first = 0;
        long second = 1;
        long next = 0;
        int temp = 0;
        if (digit == 0) {
            System.out.println("Number fibonacci: " + first);
        } else if (digit == 1) {
            System.out.println("Number fibonacci: " + second);
        } else {
            System.out.println("Number fibonacci: " + first);
            System.out.println("Number fibonacci: " + second);
            while (digit > 1 && temp < digit) {

                next = first + second;
                first = second;
                second = next;
                System.out.println("Number fibonacci: " + next);
                temp++;
            }
        }
    }

    /**
     * h)	Возведение числа в степень
     */
    public double raisingNumberToPower(int number, int power) {
        double numberInPower = 0;
        double temp = 0;
        while (temp <= power) {
            numberInPower = Math.pow(number, power);
            temp++;
        }
        System.out.println(number + " in power " + power + " = " + numberInPower);
        return numberInPower;
    }

    /**
     * i)	Таблица умножения
     */
    public void multiplyTable(int n) {
        int multiplySum;
        for (int i = 1; i <= 10; i++) {
            multiplySum = i * n;
            System.out.println("Number " + n + " multiplied by: " + i + " = " + multiplySum);
        }
    }

    /**
     * j)	Удалить цифру из числа и вернуть его (число)
     */
    public int deleteDigitFromNumber(int number, int digit) {
        System.out.println("Number= " + number + ",will be find digit:" + digit + " (if exists then delete)");
        int remainderAfterDivision;
        int newNumber = 0;
        int last = 0;
        while (number > 0) {
            remainderAfterDivision = number % 10;
            if (remainderAfterDivision == digit) {
            } else {
                newNumber = (newNumber + remainderAfterDivision) * 10;
            }
            number /= 10;
        }
        while (newNumber > 0) {
            remainderAfterDivision = newNumber % 10;
            last = (last + remainderAfterDivision) * 10;
            newNumber /= 10;
        }
        last /= 10;
        System.out.println("Number after divisible: " + last);
        return last;
    }

    /**
     * k)	Сумма первой и последней цифр числа
     */

    public int sumFirstAndLast(int num) {
        int sum;
        String val=String.valueOf(num);
        val=val.replaceAll("(?<=\\d)\\d+(?=\\d)", "");
        num=Integer.parseInt(val);//преобразование строки в число
        sum=num%10+num/10;
        System.out.println(sum);
        return sum;

    }
}