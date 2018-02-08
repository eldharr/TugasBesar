/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.entity;

/**
 *
 * @author Developer
 */
public class Item {
    public int id ;
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

    
    
            
}
