package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface TableCreator {
    void createTable(Connection connection) throws SQLException;
}
