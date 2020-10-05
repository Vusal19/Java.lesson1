package ru.geekbrains.lesson1;

import java.sql.SQLOutput;

public class Main {



   public static void main(String[] args) {
	// Создать переменные всех пройденных типов данных и инициализировать их значения.

        byte b = 50;
        short s = 700;
        int i = 6000;
        long l = 7777777L;

        float а = 80.5f;
        double в = 43.5;

        boolean bool = true;
        char ch = 'c';

        String str = "Hello";





    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calc(float a, float b, float c, float d) {
                return a * (b + (c / d));

     }

     //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

     public static boolean hw4(int a4, int b4) {
              int sum = a4 + b4;
       if ( sum >= 10 && sum <= 20) {
           return true;
       } else {
           return false;
       }

    }
    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void hw5( int s) {
        if ( s >= 0 ) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean hw6(int s) {
        if (s < 0) {
            return true;
        }else
            return false;
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void hw7(String name) {
                System.out.println("Привет, " + name);

    }


}

