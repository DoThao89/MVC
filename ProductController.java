package jdbcapp.mvc.controller;

import jdbcapp.mvc.entity.Product;
import jdbcapp.mvc.model.ProductDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    //Step 2
    ProductDaoImpl productDao = new ProductDaoImpl();

    public ProductController() throws SQLException, ClassNotFoundException {
    }

    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        ArrayList<Product> allProduct = productDao.getAllProducts();
        return allProduct;
    }

    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
        boolean result = productDao.deleteProduct(id);
        return  result;
    }
    public void createProduct(Product product) throws SQLException, ClassNotFoundException {
         productDao.createProduct(product);
    }


}
