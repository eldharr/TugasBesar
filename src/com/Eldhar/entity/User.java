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

public class User {
    public int id;
    public String name;
    public String username;
    public String password;
    public int role_id;
    
    public User () {
        
    }
    
    public User (int id, String name, String username, String password , int role_id){
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.role_id = role_id;
              
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
    
    
}
