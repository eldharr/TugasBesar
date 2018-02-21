/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.Dao;

import com.Eldhar.entity.Transaksi_detail;
import com.Eldhar.utility.DBUtil;
import com.Eldhar.utility.DaoService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eldha Ramadhanty
 */
public class DetailTransaksiDaoImpl implements DaoService<Transaksi_detail> {

    private Object Koneksi;

    @Override
    public int addData(Transaksi_detail object) {
        int result = 0;
        try {
            try (Connection connection = DBUtil.createMySQLConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "ÏNSERT INTO transaksi_detail(item_id,Transaksi_id,quantity,selling_price,discount_member) VALUES (?,?,?,?,?)";

                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getItem_id());
                ps.setInt(2, object.getTransaksi_id());
                ps.setInt(3, object.getQuantity());
                ps.setInt(4, object.getSelling_price());
                ps.setInt(5, object.getDiscount_member());

                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }

            } catch (SQLException ex) {
                Logger.getLogger(DetailTransaksiDaoImpl.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int deleteData(Transaksi_detail object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateData(Transaksi_detail object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaksi_detail> showAllData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transaksi_detail getData(Transaksi_detail id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
