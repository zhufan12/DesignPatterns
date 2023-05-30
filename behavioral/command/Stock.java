package behavioral.command;

public class Stock {
    
    public String name = "test1";

    public Integer quantity = 10;

    public void buy(){
        quantity++;
        System.out.println("Stock name :" + name  + "quantity :" + quantity + " type : buy");
    }


    public void sell(){
        quantity--;
        System.out.println("Stock name :" + name  + "quantity :" + quantity + " type : sell");
    }

    
}
