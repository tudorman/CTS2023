package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.DBReader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBRead implements DBReader {
    private static final String SQL_SELECT = "SELECT * FROM employees";

    @Override
    public ResultSet readData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(SQL_SELECT);
    }
}
