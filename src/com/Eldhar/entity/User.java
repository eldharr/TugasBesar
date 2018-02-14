/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Developer
 */
public class User {

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

    private final StringProperty user_name = new SimpleStringProperty();

    public String getUser_name() {
        return user_name.get();
    }

    public void setUser_name(String value) {
        user_name.set(value);
    }

    public StringProperty user_nameProperty() {
        return user_name;
    }
    private final StringProperty username = new SimpleStringProperty();

    public String getUsername() {
        return username.get();
    }

    public void setUsername(String value) {
        username.set(value);
    }

    public StringProperty usernameProperty() {
        return username;
    }
    private final StringProperty user_password = new SimpleStringProperty();

    public String getUser_password() {
        return user_password.get();
    }

    public void setUser_password(String value) {
        user_password.set(value);
    }

    public StringProperty user_passwordProperty() {
        return user_password;
    }

    private final ObjectProperty<Role> role_id = new SimpleObjectProperty<?>();

    public Role getRole_id() {
        return role_id.get();
    }

    public void setRole_id(Role value) {
        role_id.set(value);
    }

    public ObjectProperty role_idProperty() {
        return role_id;
    }
}
