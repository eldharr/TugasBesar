/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.controller;

import com.Eldhar.Dao.ItemDaoImpl;
import com.Eldhar.entity.Item;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Eldha Ramadhanty
 */
public class AddItemController implements Initializable {

    @FXML
    private TableView<Item> tableItem;

    @FXML
    private TextField item_id;
    @FXML
    private TextField item_name;
    @FXML
    private TextField item_purchase;
    @FXML
    private TextField item_sell;
    @FXML
    private AnchorPane apItem;

    @FXML
    private Button onSave;
    @FXML
    private Button onDelete;
    @FXML
    private Button onExit;

    private Stage homesStage;
    private ItemDaoImpl ItemDaoImpl;
    private ObservableList<Item> items;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onSave(ActionEvent event) {
    }

    @FXML
    private void onDelete(ActionEvent event) {
    }

    @FXML
    private void onExit(ActionEvent event) {
    }

}
