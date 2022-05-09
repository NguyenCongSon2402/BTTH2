/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Product {
    private int code;
private String description;
private double price;

//@Override
//public  String toString(){
//return "Student{"+" id= "+id+" name= "+name+" gender= "+gender+" dob= "+dob+"}";
//}

    public Product() {
    }

    public Product(int code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    
    
}
