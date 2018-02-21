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
public class UserDaolImpl implements DaoService<User> {

    @Override
    public int addData(User object) {
        int result = 0;
        try {

//        try {
            Connection connection = DBUtil.createMySQLConnection();
            String query
                    = "INSERT INTO USER(id, name, username, password, role_id VALUES (int, SString, String, String, int)";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, object.getUser_id());
            ps.setString(2, object.getUser_name());

            if (ps.executeUpdate() != 0) {
                connection.commit();
                result = 1;
            }
//            }
//         catch (ClassNotFoundException | SQLException ex) {
//            ViewUtil.showAlert(Alert.AlertType.ERROR, "Error", ex.getMessage());
//        }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaolImpl.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDaolImpl.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return result;
    }

    @Override
    public int deleteData(User object) {
        int result = 0;
        try {
            try (Connection connection = DBUtil.createMySQLConnection()) {
                connection.setAutoCommit(false);
                String query = "DELETE FROM user WHERE id = ?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, object.getUser_id());
                if (ps.executeUpdate() != 0) {
                    connection.commit();
                    result = 1;
                } else {
                    connection.rollback();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDaolImpl.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return result;
    }

    @Override
    public int updateData(User object) {
        int result = 0;

        try (Connection connection = DBUtil.createMySQLConnection()) {
            connection.setAutoCommit(false);
            String query
                    = "UPDATE user SET user_id = ? , user_name = ? WHERE id= ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, object.getUser_id());
            ps.setString(2, object.getUser_name());
            ps.setString(3, object.getUser_password());
            if (ps.executeUpdate() != 0) {
                connection.commit();
                result = 1;
            } else {
                connection.rollback();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaolImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return result;

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
                    user.setUser_id(rs.getInt("id.user_id"));
                    user.setUser_name(rs.getString("user_name"));
                    user.setUsername(rs.getString("username"));
                    user.setUser_password(rs.getString("user_password"));

                    Role role = new Role();
                    role.setRole_id(rs.getInt("idUserzrole"));
                    user.setRole(role);
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
                        = "SELECT u.user_id, u.user_name, u.username, u.user_password, ur.role_id FROM user u join Role ur on u.role_id = ur.role_id";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setInt(1, id.getUser_id());
                ps.setString(2, id.getUser_name());
                ps.setString(3, id.getUsername());
                ps.setString(4, id.getUser_password());
                ps.setInt(5, id.getRole().getRole_id());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    User user = new User();
                    user.setUser_id(rs.getInt("ü.user_Id"));
                    user.setUser_name(rs.getString("u.user_name"));
                    user.setUsername(rs.getString("u.username"));
                    user.setUser_password(rs.getString("u.user_password"));

                    Role role = new Role();
                    role.setRole_id(rs.getInt("idUserRole"));
                    user.setRole(role);

                    return user;
                }

            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public User checkLogin(String Username, String Password) {
        User user = null;
        try {
            try (Connection connection = DBUtil.createMySQLConnection()) {
                connection.setAutoCommit(false);
                String query
                        = "SELECT u.user_id, u.user_name, u.username, u.password, ur.role_id FROM User u join Role ur on u.role_id = ur.role_id WHERE username= ? , password = ? ";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, Username);
                ps.setString(2, Password);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    user.setUser_id(rs.getInt("ü.user_Id"));
                    user.setUser_name(rs.getString("u.user_name"));
                    user.setUsername(rs.getString("u.username"));
                    user.setUser_password(rs.getString("u.user_password"));

                    Role role = new Role();
                    role.setRole_id(rs.getInt("idUserRole"));
                    user.setRole(role);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return user;
    }

}
