package behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        User dou = new User("Dou");
        User ben = new User("Ben");

        dou.sendMessage("Hello World!");

        ben.sendMessage("Hi ~");
        
    }
}
