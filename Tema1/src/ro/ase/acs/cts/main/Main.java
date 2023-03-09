package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.*;

public class Main {
    public static void main(String[] args) {
        Orchestrator orchestrator = new Orchestrator(new DBConnection(), new TableCreation(), new DBInsertion(), new DBRead(), new DBPrint());
        orchestrator.run();
        orchestrator.setDbInserter(new DBInsertionParams());
        orchestrator.run();
    }
}
