/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.Dao;

import com.Eldhar.entity.Role;
import com.Eldhar.entity.User;
import com.Eldhar.utility.DBUtil;
import com.Eldhar.utility.DaoService;
import com.Eldhar.utility.ViewUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author Developer
 */
public class UsertDaolmpl implements DaoService<User> {

    @Override
    public int addData(User object) {
        int result = 0;
        try {

//        try {
            Connection connection = DBUtil.createMySQLConnection();
            String query
                    = "INSERT INTO USER(id, name, username, password, role_id VALUES (int, SString, String, String, int)";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, object.getId());
            ps.setString(2, object.getName());

            if (ps.executeUpdate() != 0) {
                connection.commit();
                result = 1;
            }
//            }
//         catch (ClassNotFoundException | SQLException ex) {
//            ViewUtil.showAlert(Alert.AlertType.ERROR, "Error", ex.getMessage());
//        }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsertDaolmpl.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsertDaolmpl.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return result;
    }

    @Override
    public int deleteData(User object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateData(User object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> showAllData() {
        List<User> users = new ArrayList();
        try {
            Connection connection = DBUtil.createMySQLConnection();
            String query = "SELECT * FROM user ORDER BY code";
            try (PreparedStatement ps = connection.prepareStatement(query);
                    ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setRole_id(rs.getInt("role_id"));
                    users.add(user);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ViewUtil.showAlert(Alert.AlertType.ERROR, "Error", ex.getMessage());
        }
        return users;
    }

    @Override
    public User getData(User id) {

        try {
            try (Connection connection = DBUtil.createMySQLConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "SELECT u.IdPengguna, u.Password, ur.IdUserRole FROM user u join userrole ur on u.UserRole_idUserRole = ur.idUser";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, id.getUser_id());
                ps.setString(2, id.getUser_name());
                ps.setString(3, id.getUsername());
                ps.setString(4, id.getUser_password());
                ps.setInt(5, id.getRole_id());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    User user = new User();
                    user.setUser_id(rs.getInt("ü.user_Id"));
                    user.setUser_name(rs.getString("u.user_name"));
                    user.setUsername(rs.getString("u.username"));
                    user.setUser_password(rs.getString("u.user_password"));
                    user.setRole_id(rs.getInt("ü.role_Id"));

                    Role role = new Role();
                    role.setRole_id(rs.getInt("idUserRole"));
                    user.set;

                    return user;
                }

            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

}
