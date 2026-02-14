package lesson9_wrappersAutoboxing;
import java.util.HashMap;

public class CourierDatabase {
    public static void main(String[] args) {
        HashMap<Integer, String> couriers = new HashMap<>();

        couriers.put(101, "Иван");
        couriers.put(102, "Мария");
        couriers.put(103, "Пётр");

        couriers.remove(102);

        System.out.println(couriers.containsKey(101));
        System.out.println(couriers.get(103));
    }
}
