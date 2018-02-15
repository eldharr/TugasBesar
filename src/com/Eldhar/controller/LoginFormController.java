/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Eldha Ramadhanty
 */
public class LoginFormController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField textPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnLoginAction(ActionEvent event) {
        if (textUsername.getText().trim().isEmpty() || textPassword.getText().
                trim().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("isi alert");
            a.show();
        }
        return;
    }
}
