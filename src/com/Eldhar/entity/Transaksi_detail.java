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
public class Transaksi_detail {

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

    /*  public int id;
     public int transaksi_id;
     public int quantity;
     public int selling_price;
     public int member_card;

     public Transaksi_detail  () {

     }

     public Transaksi_detail(int id, int transaksi_id, int quantity, int selling_price, int member_card) {
     this.id = id;
     this.transaksi_id = transaksi_id;
     this.quantity = quantity;
     this.selling_price = selling_price;
     this.member_card = member_card;
     }

     public int getId() {
     return id;
     }

     public void setId(int id) {
     this.id = id;
     }

     public int getTransaksi_id() {
     return transaksi_id;
     }

     public void setTransaksi_id(int transaksi_id) {
     this.transaksi_id = transaksi_id;
     }

     public int getQuantity() {
     return quantity;
     }

     public void setQuantity(int quantity) {
     this.quantity = quantity;
     }

     public int getSelling_price() {
     return selling_price;
     }

     public void setSelling_price(int selling_price) {
     this.selling_price = selling_price;
     }

     public int getMember_card() {
     return member_card;
     }

     public void setMember_card(int member_card) {
     this.member_card = member_card;
     }*/
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
    private final IntegerProperty quantity = new SimpleIntegerProperty();

    public int getQuantity() {
        return quantity.get();
    }

    public void setQuantity(int value) {
        quantity.set(value);
    }

    public IntegerProperty quantityProperty() {
        return quantity;
    }
    private final IntegerProperty selling_price = new SimpleIntegerProperty();

    public int getSelling_price() {
        return selling_price.get();
    }

    public void setSelling_price(int value) {
        selling_price.set(value);
    }

    public IntegerProperty selling_priceProperty() {
        return selling_price;
    }
    private final IntegerProperty discount_member = new SimpleIntegerProperty();

    public int getDiscount_member() {
        return discount_member.get();
    }

    public void setDiscount_member(int value) {
        discount_member.set(value);
    }

    public IntegerProperty discount_memberProperty() {
        return discount_member;

    }

}
