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
public class Role {

    private final IntegerProperty role_id = new SimpleIntegerProperty();

    public int getRole_id() {
        return role_id.get();
    }

    public void setRole_id(int value) {
        role_id.set(value);
    }

    public IntegerProperty role_idProperty() {
        return role_id;
    }

    private final StringProperty role_name = new SimpleStringProperty();

    public String getRole_name() {
        return role_name.get();
    }

    public void setRole_name(String value) {
        role_name.set(value);
    }

    public StringProperty role_nameProperty() {
        return role_name;
    }

}
