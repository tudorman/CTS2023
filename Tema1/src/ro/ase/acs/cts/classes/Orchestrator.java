package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Orchestrator {
    private final DBConnector dbConnector;
    private final TableCreator tableCreator;
    private final DBReader dbReader;
    private final DBPrinter dbPrinter;
    private DBInserter dbInserter;

    public Orchestrator(DBConnector dbConnector, TableCreator tableCreator, DBInserter dbInserter, DBReader dbReader, DBPrinter dbPrinter) {
        this.dbConnector = dbConnector;
        this.tableCreator = tableCreator;
        this.dbInserter = dbInserter;
        this.dbReader = dbReader;
        this.dbPrinter = dbPrinter;
    }

    public void setDbInserter(DBInserter dbInserter) {
        this.dbInserter = dbInserter;
    }

    public void run() {
        try {
            Connection connection = dbConnector.getConnection();
            tableCreator.createTable(connection);

            dbInserter.insertData(connection);

            ResultSet resultSet = dbReader.readData(connection);
            dbPrinter.printData(resultSet);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
