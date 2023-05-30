package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        orders.forEach(order -> {
            order.execute();
        });
        orders.clear();
    }
    
}
