package com.vti.frontend;

import com.vti.JdbcUtil;
import com.vti.repository.UserRepository;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        JdbcUtil.checkConnection();
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
        function.findAll();
        function.findById();
    }
}
