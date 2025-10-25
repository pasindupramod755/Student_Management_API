package org.example.repository;

import java.sql.*;

public class StudentRepository {
    public ResultSet getAll() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentAPI","root","1234");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Student");
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }
}
