/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.controller;

import com.Eldhar.entity.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Eldha Ramadhanty
 */
public class UserController implements Initializable {

    @FXML
    private Button UserMouseClicked;
    @FXML
    private TableView<User> tableUser;

    private User selectedUser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void UserMouseClicked(MouseEvent event) {
        selectedUser = tableUser.getSelectionModel().getSelectedItem();
        if (selectedUser != null) {
//            selectedUser.get
        }
    }

}
