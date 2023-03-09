package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBConnector {
    Connection getConnection() throws SQLException;
}
