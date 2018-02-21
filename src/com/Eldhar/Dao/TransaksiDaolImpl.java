/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.Dao;

import com.Eldhar.entity.Transaksi;
import com.Eldhar.utility.DBUtil;
import com.Eldhar.utility.DaoService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Eldha Ramadhanty
 */
public class TransaksiDaolImpl implements DaoService<Transaksi> {

    @Override
    public int addData(Transaksi object) {
        Timestamp t = new Timestamp(System.currentTimeMillis());
        int result = 0;

        try {
            Connection connection = DBUtil.createMySQLConnection();

            connection.setAutoCommit(false);
            String query
                    = "INSERT INTO transaksi (Transaksi_id,date,payment,user_id) VALUES (?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, object.getTransaksi_id());
            ps.setTimestamp(2, t);
            ps.setInt(3, object.getPayment());
            ps.setInt(4, object.getUser_id());

            if (ps.executeUpdate() != 0) {
                connection.commit();
                result = 1;
            } else {
                connection.rollback();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransaksiDaolImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiDaolImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        return result;
    }

    @Override
    public int deleteData(Transaksi object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateData(Transaksi object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaksi> showAllData() {
        ObservableList<Transaksi> transaksi = FXCollections.
                observableArrayList();
        try {
            try (Connection connection = DBUtil.createMySQLConnection()) {
                String query = "SELECT * FROM transaksi";

                PreparedStatement ps = connection.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Transaksi transaksiObject = new Transaksi();
                    transaksiObject.setTransaksi_id(rs.getInt("Transaksi_id"));
                    //transaksiObject.setDate(rs.getTimestamp("Date"));
                    transaksiObject.setPayment(rs.getInt("Payment"));
                    transaksiObject.setUser_id(rs.getInt("user_id"));

                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        return transaksi;
    }

    @Override
    public Transaksi getData(Transaksi id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
