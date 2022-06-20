/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductIO {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllStudent() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }
public void delete(String code){
String query = "delete from Product\n"+"Where Code_P = ?";
try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,code); 
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
       
}
public void insert(String code, String description,String price) {
      
        String query = "INSERT INTO Product\n"
                       
                        +"VALUES(?,?,?)";

        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, code);
            ps.setString(2, description);
            ps.setString(3, price);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
       
    }
public void editProduct(String code, String description,String price) {
        String query = "update Product\n" + "SET Code_P =? ,Description_p =? ,price =?\n"+ 
"where Code_P =?" ;
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,code);
            ps.setString(2, description);
            ps.setString(3, price);
             ps.setString(4,code);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
public Product getStudentByID(String code){
String query = "select * from Product\n"
                + "where Code_P = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, code);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3));
            }
        } catch (Exception e) {
        }
        return null;
}
    
}
