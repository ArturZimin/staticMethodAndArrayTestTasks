package by.zimin;

import java.util.Arrays;
import java.util.Random;

public class MyArrayMethod {


    //sort array Ascending, Descending
    public static void selectSort(int a[], boolean asc) {
        for (int i = 0; i < a.length; i++) {
            int elem = a[i];
            int index_elem = i;
            for (int j = i + 1; j < a.length; j++) {
                if (asc ? a[j] < elem : a[j] > elem) {
                    elem = a[j];
                    index_elem = j;
                }
            }
            //3. Swap
            if (i != index_elem) {
                int t = a[i];
                a[i] = a[index_elem];
                a[index_elem] = t;
            }
        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    /**
     * 1.	Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в
     * строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого
     * началом новой строки).Перед созданием массива подумайте, какого он будет размера.
     */
    public static int[] arrayEventNumbers() {
        int[] arr = new int[9];
        for (int i = 2, j = 0; i <= 18; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                j++;
            }
        }
        for (int o = 0; o < arr.length; o++) {
            System.out.print(arr[o]);
            System.out.print((o == 8) ? "." : ",");
        }
        System.out.print("\n");
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + "\n");
        }
        return arr;
    }

    /**
     * 2.	Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
     * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
     */
    public static int[] arrayOddNumbersUpTo99() {
        int[] arr = new int[50];
        for (int i = 1, j = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
        }
        for (int o = 0; o < arr.length; o++) {
            System.out.print(arr[o]);
            System.out.print((o == 49) ? "." : ",");
        }
        System.out.print("\n");
        for (int p = arr.length - 1; p >= 0; p--) {
            System.out.print(arr[p]);
            System.out.print((p == 50) ? "." : ",");
        }
        return arr;
    }

    /**
     * 3.	Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
     */
    public static int createArrayRandom() {
        System.out.println("\n");
        int count = 0;
        int[] arrRandom = new int[15];
        for (int i = 0; i < arrRandom.length; i++) {
            int random = (int) (Math.random() * 10);
            arrRandom[i] = random;
            System.out.print(arrRandom[i] + ((i == 14) ? "." : " , "));
            if (arrRandom[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("\n The number of even numbers is :" + count);
        return count;
    }

    /**
     * 4.	Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
     * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
     */

    public static int[] arrayRandomNumbersOf8() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            int random = (int) ((Math.random()) * 10) + 1;
            arr[i] = random;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        for (int y = 0; y < arr.length; y++) {
            if (y % 2 == 0) {
                arr[y] = 0;
            }
        }
        System.out.println("\n");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        return arr;
    }

    /**
     * 5.	Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в
     * двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
     * для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
     */
    public static void createTwoArraysFromFiveNumbers() {
        int[] arr = new int[5];
        int[] arr1 = new int[5];
        int count = 0;
        int count1 = 0;
        double averige;
        double averige1;

        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            int random = (int) ((Math.random()) * 5);
            arr[i] = random;
            System.out.print(arr[i] + " ");
            count += arr[i];
        }
        System.out.println("\n");
        for (int j = 0; j < arr1.length; j++) {
            int random1 = (int) ((Math.random()) * 5);
            arr1[j] = random1;
            System.out.print(arr1[j] + " ");
            count1 += arr1[j];
        }
        System.out.println("\n");

        averige = (double) count / arr.length;
        averige1 = (double) count1 / arr1.length;
        if (averige > averige1) {
            System.out.print("Arithmetic mean  of an arr is bigger " + averige + " then " + averige1);
        } else if (averige1 > averige) {
            System.out.print("Arithmetic mean  of an arr1 is bigger " + averige1 + " then " + averige);

        } else {
            System.out.print("Arithmetic mean   of arr and arr1 equals" + averige + " " + averige1);

        }

    }

    /**
     * 6.	Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
     * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
     */
    public static String createArrAndCheckSequence() {
        boolean isIncreasingSequence = false;
        int[] arr = new int[4];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r = (random.nextInt(89) + 10);//от 10 до 99
            arr[i] = r;
        }
        System.out.println("\n" + Arrays.toString(arr));
        int count = 0;
        for (int j = 1, y = 0; j < arr.length; j++, y++) {

            if (arr[j] > arr[y]) {
                isIncreasingSequence = true;
                count++;
            } else {
                isIncreasingSequence = false;
            }

        }
        String yesOrNo = (isIncreasingSequence == true && count == 3) ? "Yes increasing sequence." : "No , sequence is not increasing.";
        System.out.println("\n" + yesOrNo);
        return yesOrNo;

    }

    /**
     * 7.	Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
     * что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
     */
    public static int[] createArrayFromTwentyNumbersFibonacci() {
        int[] arrFib = new int[20];
        int firstFib = 0;
        int secondFib = 1;
        for (int i = 0; i < 20; i++) {
            if (i <= 1) {
                arrFib[i] = i;
            } else {
                arrFib[i] = firstFib + secondFib;
                firstFib = secondFib;
                secondFib = arrFib[i];
            }
        }
        System.out.println(Arrays.toString(arrFib));
        return arrFib;
    }

    /**
     * 8.	Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите
     * какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
     */
    public static int createArrIntNumbers12AndShowIndexMaxElem() {

        int[] arr = new int[12];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r = (random.nextInt(30) - 15);//от 10 до 99
            arr[i] = r;

        }
        int indexMaxElem = 0;
        int maxElem = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > maxElem) {
                maxElem = arr[j];
                indexMaxElem = j;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("\n" + "Max element: " + maxElem + " index : " + indexMaxElem);
        return indexMaxElem;
    }
}


