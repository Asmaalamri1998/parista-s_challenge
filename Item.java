public class Item {
   private  String name;
   private double price;

   public Item() {
}
   public Item(String name, double price){
    this.name = name;
    this.price = price;
}



public String nameGetter() {
    return this.name;
}

public void nameSetter(String name){
    this.name = name;
}

public double priceGetter(){
    return this.price;
}

public void priceSetter(double price){
    this.price=price;
}
    
}
