package main.glava2;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class zadA1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Получение текущей даты и времени
        LocalDateTime startDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Чтение строки от пользователя
        System.out.println("Введите строку:");
        String line = scan.nextLine();
        String longWord = "", shortWord = line;

        // Поиск самого длинного и короткого слова
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }

        // Вывод результатов
        System.out.println("Самое длинное слово: '" + longWord + "'");
        System.out.println("Длина: " + longWord.length());
        System.out.println("Самое короткое слово: '" + shortWord + "'");
        System.out.println("Длина: " + shortWord.length());

        // Вывод информации о разработчике и времени
        System.out.println("Разработчик: Дансаранов");
        System.out.println("Дата и время получения задания: " + startDateTime.format(formatter));

        LocalDateTime endDateTime = LocalDateTime.now();
        System.out.println("Дата и время сдачи задания: " + endDateTime.format(formatter));
    }
}