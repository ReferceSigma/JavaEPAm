package main.glava2;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class zadA7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime startDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Введите числа, разделенные пробелами:");
        String[] inputNumbers = scanner.nextLine().split(" ");

        String firstUniqueDigitNumber = findFirstUniqueDigitNumber(inputNumbers);

        if (firstUniqueDigitNumber != null) {
            System.out.println("Первое число, состоящее только из различных цифр: " + firstUniqueDigitNumber);
        } else {
            System.out.println("Нет чисел, состоящих только из различных цифр.");
        }
        System.out.println("Разработчик: Дансаранов");
        System.out.println("Дата и время получения задания: " + startDateTime.format(formatter));

        LocalDateTime endDateTime = LocalDateTime.now();
        System.out.println("Дата и время сдачи задания: " + endDateTime.format(formatter));
        scanner.close();
    }

    private static String findFirstUniqueDigitNumber(String[] numbers) {
        for (String number : numbers) {
            if (hasUniqueDigits(number)) {
                return number; // Возвращаем первое найденное число
            }
        }
        return null; // Если не найдено ни одно число
    }

    private static boolean hasUniqueDigits(String number) {
        boolean[] digitSeen = new boolean[10]; // Массив для отслеживания использованных цифр

        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // Если символ не является цифрой, возвращаем false
            }
            int digit = c - '0'; // Преобразование символа в цифру
            if (digitSeen[digit]) {
                return false; // Если цифра уже встречалась, возвращаем false
            }
            digitSeen[digit] = true; // Отмечаем эту цифру как встреченную
        }
        return true; // Все цифры уникальны
    }
}
