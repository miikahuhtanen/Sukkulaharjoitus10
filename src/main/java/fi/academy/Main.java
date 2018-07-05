package fi.academy;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Kantakasittelija kantakasittelija = new Kantakasittelija();
        Kyselija kyselija = new Kyselija();

        kyselija.start(kantakasittelija.getCon());
    }
}
