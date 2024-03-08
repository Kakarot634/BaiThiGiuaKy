package Bai7;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;

    public Product(String name, double price, int quantity) {
        this.Name = name;
        this.Price = price;
        this.Quantity = quantity;
    }
    public void placeOrder(int orderQuantity){
        if (orderQuantity <= Quantity) {
            Quantity -= orderQuantity;
            System.out.println("Order successfully. Quantity " + Name + "remaining " + Quantity);
        } else {
            System.out.println("Bai7.Product " + Name + "not enough to order");
        }
    }
    public double calculateTotal(){
        return Price * Quantity;
    }
}
class Electronic extends Product{
    public Electronic(String Name, double Price, int Quantity){
        super(Name, Price, Quantity);
    }
}
class Clothing extends Product{
    public Clothing(String Name, double Price, int Quantity){
        super(Name, Price, Quantity);
    }
}
class Food extends Product {
    public Food(String Name, double Price, int Quantity) {
        super(Name, Price, Quantity);
    }
}
class Main{
    public static void main(String[] args) {
        Electronic television = new Electronic("LG", 15000000, 10);
        Clothing shirt = new Clothing("Gucci", 2000000, 15);
        Food fruit = new Food("Apple", 5000, 100);

        television.placeOrder(5);
        shirt.placeOrder(10);
        fruit.placeOrder(50);

        System.out.println("Total price of television: " + television.calculateTotal());
        System.out.println("Total price of t shirt: " + shirt.calculateTotal());
        System.out.println("Total price of fruit: " + fruit.calculateTotal());
    }
}