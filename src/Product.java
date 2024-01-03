public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void returnPrice()
    {
        System.out.println("Name of the product: " + name + ", price: " + price + ", amount: " + amount);
    }

    public String getName()
    {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
