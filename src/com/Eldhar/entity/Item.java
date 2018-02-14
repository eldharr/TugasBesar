/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Developer
 */
public class Item {

    private final IntegerProperty item_id = new SimpleIntegerProperty();

    public int getItem_id() {
        return item_id.get();
    }

    public void setItem_id(int value) {
        item_id.set(value);
    }

    public IntegerProperty item_idProperty() {
        return item_id;
    }

    /*public int id ;
     public String username;
     public int price;
     public int stock;

     public Item () {

     }

     public Item (String username, String password) {
     this.id = id;
     this.username = username;
     this.price = price;
     this.stock = stock;

     }

     public int getId() {
     return id;
     }

     public void setId(int id) {
     this.id = id;
     }

     public String getUsername() {
     return username;
     }

     public void setUsername(String username) {
     this.username = username;
     }

     public int getPrice() {
     return price;
     }

     public void setPrice(int price) {
     this.price = price;
     }

     public int getStock() {
     return stock;
     }

     public void setStock(int stock) {
     this.stock = stock;
     }
     */
    private final StringProperty item_name = new SimpleStringProperty();

    public String getItem_name() {
        return item_name.get();
    }

    public void setItem_name(String value) {
        item_name.set(value);
    }

    public StringProperty item_nameProperty() {
        return item_name;
    }
    private final IntegerProperty item_price = new SimpleIntegerProperty();

    public int getItem_price() {
        return item_price.get();
    }

    public void setItem_price(int value) {
        item_price.set(value);
    }

    public IntegerProperty item_priceProperty() {
        return item_price;
    }
    private final IntegerProperty item_stock = new SimpleIntegerProperty();

    public int getItem_stock() {
        return item_stock.get();
    }

    public void setItem_stock(int value) {
        item_stock.set(value);
    }

    public IntegerProperty item_stockProperty() {
        return item_stock;
    }

}
