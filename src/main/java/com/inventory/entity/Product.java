package com.inventory.entity;

<<<<<<< HEAD
import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double price;
    private int quantity;
    private String description;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString() method to print product details
    @Override
    public String toString() {
        return "Product [id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description=" + description + "]";
    }
=======
import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String name;
private String description;
private double price;
private int quantity;

public Product(){}

public Product(String name,String description,double price,int quantity){
this.name=name;
this.description=description;
this.price=price;
this.quantity=quantity;
}

public int getId(){ return id; }

public String getName(){ return name; }
public void setName(String name){ this.name=name; }

public String getDescription(){ return description; }
public void setDescription(String description){ this.description=description; }

public double getPrice(){ return price; }
public void setPrice(double price){ this.price=price; }

public int getQuantity(){ return quantity; }
public void setQuantity(int quantity){ this.quantity=quantity; }

>>>>>>> 67ec10e84a6916594b093d992f5f8dedf3e1f8b4
}