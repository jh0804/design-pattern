package ex96.type1;

import ex96.type1.lib.DB;
import ex96.type1.lib.Driver;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB oralceDB = factory.createDB(Driver.MARIA); // DB, MaraiDB
        oralceDB.execute("select");
    }
}