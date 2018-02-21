/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.Dao;

import com.Eldhar.entity.Item;
import com.Eldhar.utility.DBUtil;
import com.Eldhar.utility.DaoService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Eldha Ramadhanty
 */
public class ItemDaoImpl implements DaoService<Item> {

    @Override
    public int addData(Item object) {
        int result = 0;
        try {
            try (Connection connection = DBUtil.createMySQLConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "INSERT INTO item (item_id,item_name_,item_purchase,item_sell) VALUES (?,?,?,?)";

                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getItem_id());
                ps.setString(2, object.getItem_name());
                ps.setInt(3, object.getItem_purchase());
                ps.setInt(4, object.getItem_sell());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int deleteData(Item object) {
        int result = 0;
        try {
            Connection connection = DBUtil.createMySQLConnection();
            connection.setAutoCommit(false);
            String query = "DELETE FROM item WHERE item_id = ?";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, object.getItem_id());

            if (ps.executeUpdate() != 0) {
                connection.commit();
                result = 1;
            } else {
                connection.rollback();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
//        
        return result;
    }

    @Override
    public int updateData(Item object) {
        int result = 0;
        try {
            try (Connection connection = DBUtil.createMySQLConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "UPDATE item SET item_name = ?, item_puchase = ?, item_sell = ?, WHERE item_id = ?";

                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getItem_id());
                ps.setString(2, object.getItem_name());
                ps.setInt(3, object.getItem_purchase());
                ps.setInt(4, object.getItem_sell());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public List<Item> showAllData() {
        ObservableList<Item> item = FXCollections.observableArrayList();
//        try {
//            try (Connection connection = DBUtil.createMySQLConnection()) {
//                String query = "SELECT * FROM Item  ";
//
//                PreparedStatement ps = connection.prepareStatement(query);
//                ResultSet rs = ps.executeQuery();
//
//                while (rs.next()) {
//                    Item itemObject = new Item();
//                    itemObject.setItem_id(rs.getInt("item_id"));
//                    itemObject.setItem_name(rs.getString("item_name"));
//                    itemObject.setItem_purchase(rs.getInt("item_purchase"));
//                    itemObject.setItem_sell(rs.getInt("item_sell"));
//
//                    item.add(itemObject);
//
//                }
//
//        } catch (ClassNotFoundException
//
//
//        }
//        SQLException ex
//
//
//
//            ) {
//            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE,
//                    null, ex);
//        }

        return item;
    }

    @Override
    public Item getData(Item id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
