package ru.htr.pack1;

import ru.htr.pack2.Operations;

import java.math.BigDecimal;
import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, World:)");
        var operations = new Operations();
        var a = operations.sum();

        Scanner scanner = new Scanner(System.in);//Считывание с клавиатуры
        System.out.println(scanner.nextInt());

        byte num4 = 0;//1 byte
        short num2 = 0;//2 bytes
        int num1 = 0;//4 bytes
        long num3 = 0;//8 bytes

        float t = 0.0f;
        double tt = 0.0;
        var ttt = 0;//exist Double
        var tttt = 0f;//exist Float

        var b = 0;//int, most applicable type of data
        var c = 10_000_000L;//Разряды можно отделять _(L - long, для остальных типов явное приведение)
        var d = c + c;//любая операция приводит тип к int

        Integer number = 0;//Integer - class under int(short, long, etc)
        System.out.println(number + number);//int(unboxing, Integer - объект, а не переменная)
        Integer number1 = number + number;//Integer(unboxing, sub, then "boxing" again
        //Класс обёртки используется для использования дополнительных функций без подключения дополнительных библиотек

        //Системы счисления
        int hexNumber = 0x10;//16
        int octNumber = 076;//8
        int binNumber = 0b1010;//2

        System.out.println(1.000_00_1d - 0.000_001 == 1.0d);//false, для сравнения используем eps окрестность
        System.out.println(Math.abs(1.000_00_1d - 0.000_001 - 1.0d) < 1e-12);//В коммерческом программировании
        //используют класс BigDecimal
        //BigDecimal n1 = new BigDecimal(1);
        //BigDecimal n2 = new BigDecimal(2);
        //n1.subtract(n2);
        System.out.println(7/2);
    }
}
