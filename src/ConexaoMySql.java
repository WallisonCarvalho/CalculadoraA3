import java.sql.*;

public class ConexaoMySql {
    public static String URL = "jdbc:mysql://localhost:3306/orcamento";
    public static String USER = "root";
    public static String PWD = "1111111";

    // objetos de conexão
    private Connection dbconn = null;
    private Statement sqlmgr = null;
   // private ResultSet resultsql = null;  Usado para fazer SELECT

    // OpenDataBase
    public void OpenDataBase() {
        try {
            dbconn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conectado com sucesso em:" + URL);
            sqlmgr = dbconn.createStatement();
        } catch (Exception Error) {
            System.out.println("Error on connect: " + Error.getMessage());
        }
    }

    // CloseDataBase
    public void CloseDataBase() throws SQLException {
        sqlmgr.close();
        dbconn.close();
    }

    public int ExecutaQuery(String sql) {
        try {
            return sqlmgr.executeUpdate(sql);
        } catch (Exception Error) {
            System.out.println("Error on connect: " + Error.getMessage());
        }
        return -1;
    }
}
