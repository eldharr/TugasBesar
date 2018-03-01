/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.controller;

import com.Eldhar.Dao.RoleDaoImpl;
import com.Eldhar.MainApp;
import com.Eldhar.entity.Role;
import com.Eldhar.entity.User;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Eldha Ramadhanty
 */
public class HomeController implements Initializable {

    @FXML
    private Button addBarang;
    @FXML
    private Button addUser;
    @FXML
    private Button laporan;
    private Stage items;
    private Stage items2;
    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

    @FXML
    private void btnAddBarangOnAction(ActionEvent event) {
        try {
            if (items == null) {
                items = new Stage();
                items.setTitle("item Management");
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainApp.class.getResource(
                        "view/AddBarang.fxml"));
                BorderPane root = loader.load();
                Scene scene = new Scene(root);
                AddItemController secondLayoutController = loader.
                        getController();
//                secondLayoutController.setMainController(this);
                items.setScene(scene);
//                items.initOwner(borderPane.getScene().getWindow());
                items.initModality(Modality.WINDOW_MODAL);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        if (!items.isShowing()) {
            items.show();
        } else {
            items.toFront();
        }
    }

    private void mnReportAllStudent(ActionEvent event) {
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
//                try {
//                    HashMap parameters = new HashMap();
//                    JasperPrint jasperPrint = JasperFillManager.fillReport(
//                            "report/Demo_Report1.jasper",
//                            parameters, Koneksi.createConnection());
//                    JasperViewer jasperViewer = new JasperViewer(jasperPrint,
//                            false);
//                    jasperViewer.setVisible(true);
//                } catch (ClassNotFoundException | SQLException | JRException ex) {
//                    Logger.getLogger(MenuController.class.getName()).log(
//                            Level.SEVERE, null, ex);
//                    ViewUtil.showAlert(Alert.AlertType.ERROR, "Error", ex.
//                            getMessage());
//                }
                return null;
            }
        };
    }
    ExecutorService service = Executors.newCachedThreadPool();
//        service.execute(task);
//        service.shutdown();
//    }

//    @FXML
    private void btnAddUserOnAction(ActionEvent event) {
        try {
            if (items2 == null) {
                items2 = new Stage();
                items2.setTitle("User Management");
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainApp.class.getResource(
                        "view/AddUser.fxml"));
                BorderPane root = loader.load();
                Scene scene = new Scene(root);
                AddUserController secondLayoutController = loader.
                        getController();
//                secondLayoutController.setMenuController(this);
                items2.setScene(scene);
//                items2.initOwner(borderPane.getScene().getWindow());
                items2.initModality(Modality.WINDOW_MODAL);
            }

        } catch (Exception e) {
//            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE,
//                    e.getMessage(), e);
        }
        if (!items2.isShowing()) {
            items2.show();
        } else {
            items2.toFront();
        }
    }

    @FXML
    private void btnLaporanOnAction(ActionEvent event) {
    }

    public ObservableList<User> getUser() {
        if (users == null) {
            users = FXCollections.observableArrayList();
//            users.addAll(getUserDao().showAllData());
        }
        return users;
    }

    //public UserDaoImpl getUserDao() {
    //  if (userDao == null) {
//            userDao = new UserDaoImpl();
//        }
    //      return userDao;
//    }
    private ObservableList<User> users;
//    private UserDaoImpl userDao;

    private RoleDaoImpl roleDao;

    private ObservableList<Role> roles;

    public ObservableList<Role> getRoles() {
        if (roles == null) {
            roles = FXCollections.observableArrayList();
//                    roles.addAll(getRoleDao().showAllData());
        }
        return roles;
    }
}
