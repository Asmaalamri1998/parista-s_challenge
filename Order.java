import java.util.ArrayList;

public class Order{
private String name;
private boolean ready;
private ArrayList<Item> items;

public Order(){
    this.name = "Guest";
    this.ready = true;
    this.items = new ArrayList<Item>();
}
public Order(String name){
    this.name = name;
    this.ready = false;
    this.items = new ArrayList<Item>();
}
public String getName(){
    return this.name;
}
public void setName(String name){
    this.name = name;
}
public boolean getReady(){
    return this.ready;
}
public void setReady(boolean ready){
    this.ready = ready;
}
public ArrayList<Item> getItems(){
    return items;
}
public void setItems(ArrayList<Item> items){
    this.items = items;
}

public void addItem(Item item){
     this.items.add(item);

}
public String getStatusMessage(){
    if(this.ready == true){
        return "Your order is ready.";
    }
    else{
        return "Sorry!the order will be ready soon.";
    }
}
public double getOrderTotal(){
     
     double total = 0.0;
    
     for(Item item:items) {

         total += item.priceGetter();
     }
     return total;
}
public void display(){
    System.out.printf("Customer name: %s\n", this.getName());
        for(Item item:items) {
            System.out.printf("%s - $%.2f\n",item.nameGetter(), item.priceGetter());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
    }
}
