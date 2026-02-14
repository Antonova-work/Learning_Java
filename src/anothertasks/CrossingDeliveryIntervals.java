package anothertasks;

public class CrossingDeliveryIntervals {
    public static void main(String[] args) {
        System.out.println(crossingDeliveryIntervals(1, 3, 4, 8));
    }

    public static boolean crossingDeliveryIntervals (int start1, int end1, int start2, int end2){
        return (start2 < end1) && (start1 < end2);
    }
}

