package lesson6;

import java.util.Scanner;

public class InputConsole {

    private static Scanner scanner = new Scanner(System.in);

        // Вспомогательный метод для получения строки от пользователя
    public static String prompt(String message) {
        // Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Метод для чтения данных из консоли
    public static void inputFromConsole(Order order) {
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }

}


