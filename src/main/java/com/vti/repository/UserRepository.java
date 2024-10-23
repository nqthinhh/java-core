package com.vti.repository;

import com.vti.JdbcUtil;
import com.vti.entity.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException {
        String sql = "SELECT * FROM users";
        try(Connection connection = JdbcUtil.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setFullName(rs.getString("full_name"));
                user.setPassword(rs.getString("password"));
                String role = rs.getString("role");
                user.setRole(User.Role.valueOf(role));
                user.setProSkill(rs.getString("pro_skill"));
                user.setExpInYear(rs.getInt("exp_in_year"));
                users.add(user);
            }
            return users;
        }
    }

    public User findById(int id) throws SQLException {
        String sql = "SELECT * FROM user WHERE id = ? AND n = ?";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);

                ){
            pStmt.setInt(1, id );
            try (ResultSet rs = pStmt.executeQuery()){
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setEmail(rs.getString("email"));
                    user.setFullName(rs.getString("full_name"));
                    user.setPassword(rs.getString("password"));
                    String role = rs.getString("role");
                    user.setRole(User.Role.valueOf(role));
                    user.setProSkill(rs.getString("pro_skill"));
                    user.setExpInYear(rs.getInt("exp_in_year"));
                    return user;
                }
                return null;
            }
        }

    }
}
