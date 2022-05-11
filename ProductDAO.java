package jdbcapp.mvc.model;

import jdbcapp.mvc.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    //Create product
    public void createProduct(Product product) throws SQLException, ClassNotFoundException;

    //Read product by id
    public Product getProductById(int id) throws SQLException, ClassNotFoundException;

    //Get all products
    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException;

    //Update product
    public void updateProduct(Product product) throws SQLException, ClassNotFoundException;

    //Delete product
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException;

    //get product by name
    public ArrayList<Product> getProductByName(String name);


}
