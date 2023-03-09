package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.DBInserter;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsertion implements DBInserter {
    private static final String SQL_INSERT = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";

    @Override
    public void insertData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(SQL_INSERT);
        statement.close();
    }
}
