package com.example.recyclerviewday2;

public class Product {
    private int id;
    private String txtTitle;
    private int price;

    public Product(int id, String txtTitle, int price){
        this.id = id;
        this.price = price;
        this.txtTitle = txtTitle;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setTitle(String txtTitle){
        this.txtTitle = txtTitle;
    }

    public String getTitle(){
        return txtTitle;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
