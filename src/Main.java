
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Напишите программу, которая позволит решить простое уравнение относительно x.
        // Программа принимает на вход строку длиной 5 символов.
        // Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
        // Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
        // Нужно найти неизвестное.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String equation = scanner.nextLine();
        if (equation.length() == 5){ //Проверяем строку на длину в 5 символов
            int result; //Будем записывать результат вычисления
            //Переменные в которые записываем числовой элемент массива
            int num0 = Character.getNumericValue(equation.charAt(0));
            int num2 = Character.getNumericValue(equation.charAt(2));
            int num4 = Character.getNumericValue(equation.charAt(4));
            if(Character.isDigit(equation.charAt(2)) & Character.isDigit(equation.charAt(4))) {
                if (equation.charAt(0) == 'x' & equation.charAt(1) == '+' & equation.charAt(3) == '=') {
                    result = num4 - num2;
                    System.out.println("Вывод: " + (result));
                } else if (equation.charAt(0) == 'x' & equation.charAt(1) == '-' & equation.charAt(3) == '=') {
                    result = num2 - num4;
                    System.out.println("Вывод: " + (result));
                }
            }
            else if (Character.isDigit(equation.charAt(0)) & Character.isDigit(equation.charAt(4))) {
                if (equation.charAt(2) == 'x' & equation.charAt(1) == '-' & equation.charAt(3) == '=') {
                    result = num0 - num4;
                    System.out.println("Вывод: " + (result));
                } else if (equation.charAt(2) == 'x' & equation.charAt(1) == '+' & equation.charAt(3) == '=') {
                    result = num4 - num0;
                    System.out.println("Вывод: " + (result));
                }
            }
            else if (Character.isDigit(equation.charAt(0)) & Character.isDigit(equation.charAt(2))) {
                if (equation.charAt(4) == 'x' & equation.charAt(1) == '+' & equation.charAt(3) == '=') {
                    result = num0 + num2;
                    System.out.println("Вывод: " + (result));
                } else if (equation.charAt(4) == 'x' & equation.charAt(1) == '-' & equation.charAt(3) == '=') {
                    result = num0 - num2;
                    System.out.println("Вывод: " + (result));
                }
            }
            else {
                System.out.println("Что-то пошло не так...");
            }
        }
        else if (equation.length() < 5){
            System.out.println("Вы ввели меньше 5 символов.");
        }
        else {
            System.out.println("Вы ввели больше 5 символов.");
        }
    }
}

    //Пример для теста работы программы:
    // - Ввод: x+5=7
    // - Вывод: 2
    // - Ввод: 3-x=9
    // - Вывод: -6
    // - Ввод: 3-3=x
    // - Вывод: 0
