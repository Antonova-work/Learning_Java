package lessons.lesson10_interfaces;

public class NotificationSystem {
    public static void main(String[] args) {
        Messenger mySmsMessenger = new SmsMessenger();
        mySmsMessenger.sendMessage("Привет, я смс!");

        Messenger myEmailMessenger = new EmailMessenger();
        myEmailMessenger.sendMessage("Привет, я имейл!");
    }

}

interface Messenger{
    void sendMessage(String text);
}
class SmsMessenger implements Messenger {
    public void sendMessage(String text){
        System.out.println("Отправлено SMS: " + text);
    }
}

class EmailMessenger implements Messenger{
    public void sendMessage(String text){
        System.out.println("Отправлен Email: " + text);
    }
}