package com;

 


public class Order {
    private int id;
    private String name;
    private int quantity;
    private int price;

    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    public Order(int id, String name, int quantity, int price) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

 

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

 

    public int getQuantity() {
        return quantity;
    }

 

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 

    public int getPrice() {
        return price;
    }

 

    public void setPrice(int price) {
        this.price = price;
    }




 

}