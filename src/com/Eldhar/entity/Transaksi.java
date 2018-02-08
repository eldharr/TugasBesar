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
public class Transaksi {
    public int id;
    public String date;
    public int payment;
    public int user_id;
    
    public Transaksi () {
        
    }

    public Transaksi(int id, String date, int payment, int user_id) {
        this.id = id;
        this.date = date;
        this.payment = payment;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    
}
