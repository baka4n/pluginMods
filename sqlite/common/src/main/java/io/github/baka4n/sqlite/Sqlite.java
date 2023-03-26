package io.github.baka4n.sqlite;

import java.sql.SQLException;

public class Sqlite {
    public static final String MOD_ID = "sqlite";

    public static void init() {
        SQLUtils sqlUtils = new SQLUtils(MOD_ID);
        sqlUtils.creteSQL("test");
        SQLUtils.SQLHelp test = sqlUtils.getSQL("test", false);
        try {
            SQLUtils.SQLStmt table = sqlUtils.createTable(test, """
                    CREATE TABLE database_name.table_name(
                       column1 datatype  PRIMARY KEY(one or more columns),
                       column2 datatype,
                       column3 datatype,
                       .....
                       columnN datatype,
                    );
                    """);
            System.out.println(table);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}