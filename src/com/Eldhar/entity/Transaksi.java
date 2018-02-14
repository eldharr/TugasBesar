/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Developer
 */
public class Transaksi {

    private final IntegerProperty Transaksi_id = new SimpleIntegerProperty();

    public int getTransaksi_id() {
        return Transaksi_id.get();
    }

    public void setTransaksi_id(int value) {
        Transaksi_id.set(value);
    }

    public IntegerProperty Transaksi_idProperty() {
        return Transaksi_id;
    }

    /*public int id;
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
     }*/
    private final IntegerProperty payment = new SimpleIntegerProperty();

    public int getPayment() {
        return payment.get();
    }

    public void setPayment(int value) {
        payment.set(value);
    }

    public IntegerProperty paymentProperty() {
        return payment;
    }
    private final IntegerProperty user_id = new SimpleIntegerProperty();

    public int getUser_id() {
        return user_id.get();
    }

    public void setUser_id(int value) {
        user_id.set(value);
    }

    public IntegerProperty user_idProperty() {
        return user_id;
    }

}
