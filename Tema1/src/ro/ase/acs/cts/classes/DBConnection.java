package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.DBConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements DBConnector {
    private static final String URL = "jdbc:sqlite:database.db";

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
