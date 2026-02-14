package lessons.lesson8_collections;
import java.util.ArrayList; // Нужно импортировать!


public class ListOfOrders {
    public static void main(String[] args) {

        ArrayList<String> bascet = new ArrayList<>();

        bascet.add("Молоко");
        bascet.add("Хлеб");
        bascet.add("Сыр");

        System.out.println(bascet.size());

        bascet.remove(1);

        for (String item : bascet) {
            System.out.println(item);
        }
    }
}
