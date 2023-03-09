package ro.ase.acs.cts.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DBPrinter {
    void printData(ResultSet resultSet) throws SQLException;
}
