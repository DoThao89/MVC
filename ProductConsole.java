package jdbcapp.mvc.view;

import jdbcapp.mvc.controller.ProductController;
import jdbcapp.mvc.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsole {

    //Step 1 request to Controller
    ProductController productController = new ProductController();

    private final Scanner sc;//field of ProductConsole class
    public ProductConsole() throws SQLException, ClassNotFoundException {
        this.sc = new Scanner(System.in);
    }

    private int menu(){
        System.out.println("=====Product Management=====");
        System.out.println("1. Add product");
        System.out.println("2. Show all product");
        System.out.println("3. Remote product");
        System.out.println("5. Export product to json file");
        System.out.println("6. Read json file");
        System.out.println("4. Exit");
        int choice = readInt(0,4);
        return choice;
    }
    public int readInt(int min, int max){
        int choice;
        while (true){
            choice = Integer.parseInt(sc.nextLine());
            if(choice>=min && choice <=max){
                break;
            }
        }
        return choice;
    }

    public void start() throws SQLException, ClassNotFoundException {
        while (true){
            int choice = menu();
            switch (choice){
                case 0: System.exit(0);
                break;
                case 1:addProduct();
                break;
                case 2: showAll();
                break;
                case 3: removeProduct();
                break;
                default:throw new AssertionError();
            }
        }
    }

    public void addProduct() throws SQLException, ClassNotFoundException {
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product Description: ");
        String desc = sc.nextLine();
        System.out.println("Enter product price:");
        Double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(name,desc,price);
        //step 4
        productController.createProduct(product);
    }
    public void removeProduct() throws SQLException, ClassNotFoundException {
        System.out.println("Enter id of product ");
        int id = Integer.parseInt(sc.nextLine());
        //step4
        boolean result = productController.deleteProduct(id);
        if(result){
            System.out.println("Product was removed");
        }else {
            System.out.println("Product not found!");
        }
    }
    public void showAll() throws SQLException, ClassNotFoundException {
        //Step 1
        ArrayList<Product> products = productController.getAllProducts();
        System.out.println("---All products---");
        System.out.println("ID\tName\tDesc\tPrice");
        //Step 4
        for (Product product : products) {
            System.out.println(product.getId() + "\t" + product.getProName() + "\t"
            +product.getProDesc() +"\t" + product.getPrice());

        }

    }

}
