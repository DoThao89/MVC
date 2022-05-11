package jdbcapp.mvc.model;


import jdbcapp.mvc.dao.SQLServerConnection;
import jdbcapp.mvc.entity.Product;

import java.sql.*;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDAO {
    private final Connection connection = SQLServerConnection.getSQLServerConnection();
    private final String SQL_CREATE_PRODUCT = "insert into products(proName, proDesc, price) values(?,?,?)";
    private final String SQL_GET_PRODUCT_BY_ID = "select * from product where id =?";
    private final String SQL_UPDATE_PRODUCT = "update product set proName =?, proDesc =?, price =?, where id=?";
    private final String SQL_DELETE_PRODUCT = "delete from product where id=?";
    private final String SQL_GET_PRODUCT_BY_NAME = "select * from product where proName =?";

    public ProductDaoImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void createProduct(Product product) throws SQLException, ClassNotFoundException {

        //SQL engine:
        //insert into product values(...)
       // Connection connection = SQLServerConnection.getSQLServerConnection();
       // String query = "insert into product(proName,proDesc,price) values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE_PRODUCT, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,product.getProName());
        preparedStatement.setString(2,product.getProDesc());
        preparedStatement.setDouble(3,product.getPrice());

        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        if(resultSet.next()){
            product.setId(resultSet.getInt(1));
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        //Product product = new Product("Macbook","Apple",2000.0);
        //Product product = new Product();
       // productDao.createProduct(product);
      //  System.out.println(product.getId());

       // productDao.deleteProduct(11);
       Product product = new Product();
       product = productDao.getProductById(3);
        System.out.println(product.getProName());


    }

    @Override
    public Product getProductById(int id) throws SQLException, ClassNotFoundException {
        //select * from product where id =...
        Product product = new Product();

        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select * from product where id =?";
        PreparedStatement preparedStatement =connection.prepareStatement(query);

        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        //select * from product
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select * from product";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<Product> allProduct = new ArrayList<>();
        while (resultSet.next()){
            Product product = new Product();
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
            allProduct.add(product);
        }
        return allProduct;
    }

    @Override
    public void updateProduct(Product product) throws SQLException, ClassNotFoundException {
        //update ..set...
        Connection connection = SQLServerConnection.getSQLServerConnection();

        String query = "update product set proName =?, proDesc =?, price =? where id =?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,product.getProName());
        preparedStatement.setString(2,product.getProDesc());
        preparedStatement.setDouble(3,product.getPrice());
        preparedStatement.setInt(4,product.getId());

        preparedStatement.executeUpdate();
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
        //delete...
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "delete from product where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
            return true;

    }

    @Override
    public ArrayList<Product> getProductByName(String name) {
        String query = "select * from product where proName =?";
        ArrayList<Product> productList = new ArrayList<>();
        return null;
    }
}
