package com.company;

public class Main {

    public static void blank_space() {
        System.out.println("------------------------------------------");
    }

    public static void task_1(int a, int b) {
        System.out.println("\nЗадача 1. Обмен значений");
        System.out.println("Вводятся целые числа a и b:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значения a и b после обмена:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        blank_space();
    }

    public static void task_2(int n) {
        System.out.println("Задача 2. Конец уроков");
        System.out.println("Дан номер урока (число от 1 до 10):");
        System.out.println("n = " + n);
        int hour;
        int min;
        hour = 9 * 60 + (n * 45 + n / 2 * 5 + (n - 1) / 2 * 15);
        min = hour % 60;
        hour /= 60;
        System.out.println("Время окончания урока в часах и минутах:");
        System.out.format("%02d:%02d%n", hour, min);
        blank_space();
    }

    public static void task_3(int h_1, int m_1, int s_1, int h_2, int m_2, int s_2) {
        System.out.println("Задача 3. Разность времен");
        System.out.println("Даны два момента времени:");
        System.out.println(h_1 + "\t" + m_1 + "\t" + s_1);
        System.out.println(h_2 + "\t" + m_2 + "\t" + s_2);
        int result = (h_2 * 3600 + m_2 * 60 + s_2) - (h_1 * 3600 + m_1 * 60 + s_1);
        System.out.println("Число секунд между этими моментами времени:\n" + result);
        blank_space();
    }

    public static void task_4(int n, int m) {
        System.out.println("Задача 4. Автопробег");
        System.out.println("За день машина проезжает n километров." +
                "\nСколько дней нужно, чтобы проехать маршрут длиной m километров?");
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        int result = (m - 1) / n + 1;
        System.out.println("Ответ: " + result);
        blank_space();
    }

    public static void task_5(double h, double a, double b) {
        System.out.println("Задача 5. Улитка");
        System.out.println("Улитка ползёт по вертикальному шесту высотой h метров," +
                " поднимаясь за день на a метров,\nа за ночь спускаясь на b метров. " +
                "На какой день улитка доползёт до вершины шеста?");
        System.out.println("h = " + h + "\t" + "a = " + a + "\t\t" + "b = " + b);
        double result = Math.ceil((h - a) / (a - b)) + 1;
        System.out.println("Ответ: " + (int) result);
        blank_space();
    }

    public static void task_6(int a, int b) {
        System.out.println("Задача 6. Максимум");
        System.out.println("Считывается два целых числа a и b (целые от 1 до 1000):");
        System.out.println("a = " + a + "\t" + "b = " + b);
        int result = (((a / b) * a + (b / a) * b) / ((a / b) + (b / a)));
        System.out.println("Наибольшее значение из них: " + result);
        blank_space();
    }

    public static void task_7(int x_1, int y_1, int x_2, int y_2) {
        System.out.println("Задача 7. Ладья");
        System.out.println("Вводятся четыре числа: координаты ладьи (два числа) и " +
                "координаты другой фигуры (два числа):");
        System.out.println("x_1 = " + x_1);
        System.out.println("y_1 = " + y_1);
        System.out.println("x_2 = " + x_2);
        System.out.println("y_2 = " + y_2);
        String result = ((x_1 == x_2) ^ (y_1 == y_2) ? "YES" : "NO");
        System.out.println("Сможет ли ладья побить другую фигуру за 1 ход?\nОтвет: " + result);
        blank_space();
    }

    public static void task_8(int a, int b, int c) {
        System.out.println("Задача 8. Количество равных из трех");
        System.out.println("Даны три целых числа, записанных в отдельных строках. " +
                "Определите, сколько среди них совпадающих:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Программа выведет одно из чисел: 3 (если все совпадают)," +
                "\n2 (если два совпадают) или 0 (если все числа различны).");
        if ((a == b) && (a == c)) System.out.println("Ответ: 3");
        else if ((a == b) || (a == c) || (b == c)) System.out.println("Ответ: 2");
        else System.out.println("Ответ: 0");
        blank_space();
    }

    public static void task_9(int N, int[] numbers) {
        System.out.println("Задача 9. Количество элементов, больших предыдущего");
        System.out.println("Дан массив, состоящий из целых чисел. Сначала задано число N —" +
                "\nколичество элементов в массиве (1N10000). Далее через пробел записаны N чисел —" +
                "\nэлементы массива. Массив состоит из целых чисел.");
        System.out.println(N);
        for (int elem : numbers) System.out.print(elem + " ");
        int result = 0;
        for (int i = 1; i < N; i++)
            if (numbers[i] > numbers[i - 1]) result++;
        System.out.println("\nКоличество элементов массива, больших предыдущего:\n" + result);
        blank_space();
    }

    public static void task_10(int N, int[] numbers) {
        System.out.println("Задача 10. Количество элементов больших обоих соседей");
        System.out.println("Задано число N — количество элементов в массиве (1N100)." +
                "\nДалее через пробел записаны N чисел — элементы массива." +
                "\nМассив состоит из целых чисел.");
        System.out.println(N);
        for (int elem : numbers) System.out.print(elem + " ");
        int result = 0;
        if (N > 1) {
            for (int i = 1; i < N - 1; i++)
                if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) result++;
        }
        System.out.println("\nКоличество элементов массива, у которых два соседа" +
                "\nи которые при этом строго больше обоих своих соседей:\n" + result);
        blank_space();
    }

    public static void task_11(int N, int[] numbers) {
        System.out.println("Задача 11. Переставить соседние элементы");
        System.out.println("Задано задано число N — количество элементов в массиве (1N35)." +
                "\nДалее через пробел записаны N чисел — элементы массива." +
                "\nМассив состоит из целых чисел.");
        System.out.println(N);
        for (int elem : numbers) System.out.print(elem + " ");
        System.out.println("\nМассив, полученный переставлением соседних элементов исходного массива" +
                "\n(1-й элемент поменян со 2-м, 3-й с 4-м и т.д.). Если элементов нечетное" +
                "\nчисло, то последний элемент останется на своем месте.");
        if (N == 1) for (int elem : numbers) System.out.print(elem + " ");
        else if (N % 2 == 0) {
            for (int i = 0, temp; i < N; i += 2) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
            for (int elem : numbers) System.out.print(elem + " ");
        } else {
            for (int i = 0, temp; i < N - 1; i += 2) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
            for (int elem : numbers) System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        task_1(3, 6);
        task_2(8);
        task_3(1, 2, 30, 1, 3, 20);
        task_4(3, 61);
        task_5(20, 7, 3);
        task_6(13, 24);
        task_7(1, 1, 2, 1);
        task_8(1, 2, 2);
        task_9(5, new int[]{1, 2, 3, 4, 5});
        task_10(5, new int[]{1, 5, 1, 5, 1});
        task_11(6, new int[]{4, 5, 3, 4, 2, 3});
    }
}
