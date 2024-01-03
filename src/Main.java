import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome to the supermarket!");

        boolean stop = false;
        Supermarket supermarket = new Supermarket();

        while (!stop) {
            System.out.println("Choose the number of your action: \n" +
                    "1. Add product to the inventory \n" + "2. List the selling prices of each product \n" + "3. Sell a product \n" + "4. Stop \n");
            int action = Integer.parseInt(scan.nextLine());

            switch (action){
                case 1:
                    System.out.println("Input the name of your product");
                    String name = scan.nextLine();
                    System.out.println("Input the price of one product");
                    double price = Double.parseDouble(scan.nextLine());
                    System.out.println("Input the amount of this products");
                    int amount = Integer.parseInt(scan.nextLine());

                    Product newProduct = new Product(name, price, amount);
                    supermarket.addProduct(newProduct);
                    break;

                case 2:
                    System.out.println("Price of products in the supermarket:");
                    supermarket.printPrices();
                    break;

                case 3:
                    System.out.println("Input the name of your product to sell");
                    String search = scan.nextLine();
                    System.out.println("Input the amount of products to sell");
                    int numProducts = Integer.parseInt(scan.nextLine());
                    supermarket.sellProduct(search, numProducts);
                    break;

                case 4:
                    stop = true;
                    System.out.println("Good Bye");
                    break;

                case 5:
                    System.out.println("Please, choose a valid option");
            }
        }
    }
}