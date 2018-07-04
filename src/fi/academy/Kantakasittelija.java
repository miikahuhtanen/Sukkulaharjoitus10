package fi.academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kantakasittelija {

    public void luoYhteys() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tenttikysymykset?useSSL=false&serverTimezone=UTC", "root", "salasana");
            System.out.println("Yhteys onnistui!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void haeTiedot() {
        
    }
}
