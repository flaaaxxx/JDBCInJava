package flaaaxxx;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        List<String> queries = new ArrayList<>();
        queries.add("UPDATE user set password = \"1\" WHERE username LIKE \"nnnn\";");
        queries.add("UPDATE user set password = \"4\" WHERE username LIKE \"aaaa\";");
        QueryExecutor.executeQueriesInOneTransaction(queries);
        // pierwsza modyfikacja pliku

        System.out.println("Hello Intellij and Main");

    }

    private void name() {
        System.out.println("Zmiana w drugim repo");
    }
}
