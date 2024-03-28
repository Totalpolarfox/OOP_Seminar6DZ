package lesson6;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно
     * соответствовать
     * принципу SRP.
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order();
        InputConsole.inputFromConsole(order);
        SaverJson.saveToJson(order);
    }
}
