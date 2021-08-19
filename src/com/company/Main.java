package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        calculator(scan);
    }
    public static void calculator(Scanner scan) {
        try {
            System.out.println("Аргумент1 АрифметическаяОперация Аргумент2");
            String arifConsole = scan.nextLine().toLowerCase(Locale.ROOT);
            String[] arif = arifConsole.split(" ");
            double arg1 = Double.parseDouble(arif[0]);
            double arg2 = Double.parseDouble(arif[2]);
            switch (arif[1]) {
                case "плюс":
                    System.out.println(arg1 + arg2);
                    break;
                case "минус":
                    System.out.println(arg1 - arg2);
                    break;
                case "умножить":
                    System.out.println(arg1 * arg2);
                    break;
                case "разделить":
                    if (arg2 == 0) {
                        throw new ArithmeticException();
                    }
                    System.out.println(arg1 / arg2);
                    break;
                default:
                    System.err.println("Такой арифметической операции нет");
                    calculator(scan);
            }
        } catch (ArithmeticException ex) {
            System.err.println("Делить на ноль нельзя ");
            calculator(scan);
        } catch (NumberFormatException ex) {
            System.err.println("ОБЯЗАТЕЛЬНО вводите с пробелами!!!\nТакже проверьте что в качестве аргументов указаны цифры.");
            calculator(scan);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("ОБЯЗАТЕЛЬНО вводите с пробелами!!!");
            calculator(scan);
        }
    }
}
