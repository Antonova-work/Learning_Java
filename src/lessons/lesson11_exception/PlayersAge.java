package lessons.lesson11_exception;

import java.util.Scanner;

public class PlayersAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите возраст:");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Ваш возраст " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка, введите цифры!");
            }
        }
    }

}
