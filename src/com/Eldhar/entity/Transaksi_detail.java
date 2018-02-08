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
public class Transaksi_detail {
    public int id;
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
    }
    
            
}
