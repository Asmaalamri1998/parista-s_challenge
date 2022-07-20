import java.util.ArrayList;

public class TestOrders {
    /**
     * @param args
     */
    public static void main(String[] args) {
    
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Asma");
        Order order4 = new Order("Lateen");
        Order order5 = new Order("Nora");

        Item item1 = new Item("Drip Coffee", 7.0);
        Item item2 = new Item( "Latte", 12.5);
        Item item3 = new Item("Cappuccino", 12.5);

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item2);

        order3.addItem(item1);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item3);
        order5.addItem(item1);

        String message1= order1.getStatusMessage();
        System.out.println(message1);

        order1.setReady(true);
        System.out.println(message1);

       double total1= order1.getOrderTotal();
       System.out.println(total1);

        order1.display();

        order3.display();



    

}
}
