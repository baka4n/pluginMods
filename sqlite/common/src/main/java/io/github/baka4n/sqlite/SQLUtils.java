package io.github.baka4n.sqlite;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.MessageFormat;

/**
 * @since 创建sql的基本内部类
 * @since create sql utils
 */
public class SQLUtils {

    public final File modDir;

    /**
     * 创建专属dir
     * @param dir can use modid
     */
    public SQLUtils(String dir) {
        this.modDir = new File(System.getProperty("user.dir"), MessageFormat.format("sql{0}{1}", File.separator, dir));
        if (!this.modDir.exists()) {
            this.modDir.mkdirs();
        }
    }

    public void creteSQL(String sqlName) {
        final var db = new File(modDir, MessageFormat.format("{0}.db", sqlName));
        if (!db.exists()) {
            try {
                db.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public SQLHelp getSQL(String sqlName, boolean autoCommit) {
        try {
            Class.forName("org.sqlite.JDBC");
            return new SQLHelp(MessageFormat.format("jdbc:sqlite:{0}{1}.db", modDir, sqlName), autoCommit);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

    public SQLStmt createTable(SQLHelp sqlHelp, String sqlSheetName) throws SQLException {
        return new SQLStmt(sqlHelp, sqlSheetName);
    }

    public void selectTable(Connection c, String sqlSelectName) throws SQLException {

    }

    public static class SQLHelp {
        private final Connection c;

        public SQLHelp(String url, boolean autoCommit) throws SQLException {
            c = DriverManager.getConnection(url);
            c.setAutoCommit(autoCommit);
        }

        public void insertTable(String sqlInsertName, String name, Object o) throws SQLException {
            PreparedStatement pstmt = c.prepareStatement(sqlInsertName);
            pstmt.setString(1, name);
            pstmt.setObject(2, o);
        }
    }

    public static class SQLStmt {
        private final Statement stmt;

        public SQLStmt(SQLHelp sqlHelp, String sqlSheetName) throws SQLException {

            Statement statement = sqlHelp.c.createStatement();
            statement.execute(sqlSheetName);
            if (!sqlHelp.c.getAutoCommit()) {
                sqlHelp.c.commit();
            }
            this.stmt = statement;
        }

        public ResultSet selectAll(String selectSql) throws SQLException {
            return stmt.executeQuery(selectSql);
        }
    }

}
