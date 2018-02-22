/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.controller;

import com.Eldhar.Dao.ItemDaoImpl;
import com.Eldhar.entity.Item;
import com.Eldhar.utility.TextUtil;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
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

    private TableColumn<Item, Integer> colItem_id;
    @FXML
    private TableColumn<Item, String> colItem_name;
    @FXML
    private TableColumn<Item, Integer> colItem_purchase;
    @FXML
    private TableColumn<Item, Integer> colItem_sell;

    public Item selectedItem;
    @FXML
    private Item btnonSaveItem;
    @FXML
    private Item btnonDeleteItem;
    @FXML
    private Item btnonExitItem;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableItem.setItems(getItems());

    }

    @FXML
    private void onSave(ActionEvent event) {
        if (selectedItem == null) {
            if (!TextUtil.isEmptyField(item_id, item_name, item_purchase,
                    item_sell)) {
                Item item = new Item();

                item.setItem_id(Integer.valueOf(item_id.getText().trim()));
                item.setItem_name(item_name.getText().trim());
                item.setItem_purchase(Integer.valueOf(
                        item_purchase.getText().trim()));
                item.
                        setItem_sell(Integer.valueOf(item_sell.getText().
                                        trim()));

                if (getItemDao().addData(item) == 1) {
                    getItems().clear();
                    getItems().addAll(getItemDao().showAllData());

                    tableItem.refresh();

                    item_id.clear();
                    item_name.clear();
                    item_purchase.clear();
                    item_sell.clear();

                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Isi nama terlebih dahulu");
                alert.showAndWait();
            }
        } else {
            if (!TextUtil.isEmptyField(item_id, item_name, item_purchase,
                    item_sell)) {

            }

        }
    }

    @FXML
    private void onDelete(ActionEvent event) {
    }

    @FXML
    private void onExit(ActionEvent event) {
        Platform.exit();
    }

    private ObservableList<Item> getItems() {
        if (items == null) {
            items = FXCollections.observableArrayList();
            items.addAll(getItemDao().showAllData());
        }
        return items;
    }

    public ItemDaoImpl getItemDao() {
        if (ItemDaoImpl == null) {
            ItemDaoImpl = new ItemDaoImpl();
        }
        return ItemDaoImpl;
    }

}
