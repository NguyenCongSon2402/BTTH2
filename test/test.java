
import dao.ProductIO;
import entity.Product;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        ProductIO dao=new ProductIO();
                List<Product> list=dao.getAllStudent();
        System.out.println(list);
    }
}
