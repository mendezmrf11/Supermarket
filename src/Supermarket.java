import java.util.ArrayList;

public class Supermarket {
    
    private ArrayList <Product> products;
    
    public Supermarket()
    {
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product)
    {
        Product p = searchProductByName(product.getName());
        if(p == null)
        {
            products.add(product);
            System.out.println("Product added successfully");
        }
        else {
            p.setAmount(p.getAmount() + product.getAmount());
        }
    }
    
    public void printPrices()
    {
        for(Product product : products)
        {
            product.returnPrice();
        }
    }

    public void sellProduct(String name, int amount)
    {
        Product p = searchProductByName(name);
        if (p == null)
        {
            System.out.println("The product doesn't exist");
        }

        else if(p.getAmount() < amount)
        {
            System.out.println("Not enough products in inventory to make a sale");
        }

        else {
            System.out.println("sale successfully");
            p.setAmount(p.getAmount()-amount);
        }
    }

    public Product searchProductByName(String name)
    {
        for(Product product : products)
        {
            if(product.getName().equalsIgnoreCase(name))
            {
                return product;
            }
        }
        return null;
    }
    
}
