package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Postgresql2 {
    public static void main(String[] args) {
        testDatabase();
    }

    private static void testDatabase() {
        try {
            String url = "jdbc:postgresql://localhost:5433/postgres";
            String login = "postgres";
            String password = "postgrs";
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();

                //stmt.execute("insert into test2 (a2) values (999)");

                //for (int i = 100; i < 200; i++) {
                //    stmt.execute("insert into test2 (a2) values (" + i + ")");
                //}

              //  for (int i = 100; i < 200; i++) {
              //      PreparedStatement prs = con.prepareStatement("insert into test2 (a2) values (?)");
              //      prs.setLong(1, i);
              //      prs.execute();
              //  }


                ResultSet rs = stmt.executeQuery("SELECT * FROM test2 order by a2");
                while (rs.next()) {
                    String str = rs.getString("a2");
                    System.out.println("a2 num:" + str);
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


