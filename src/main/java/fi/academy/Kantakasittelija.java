package fi.academy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Kantakasittelija {

    public void luoYhteys() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tenttikysymykset?useSSL=false&serverTimezone=UTC", "root", "password");
            System.out.println("Yhteys onnistui!");

            System.out.println(haeKysymyksetListaan(con));


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Kysymys> haeKysymyksetListaan(Connection con) throws SQLException {
        ArrayList<Kysymys> lista = new ArrayList<>();

        String lauseke = "SELECT * FROM kysymys;";
        PreparedStatement lause = con.prepareStatement(lauseke);
        ResultSet rs = lause.executeQuery();

        while (rs.next()){
            lista.add(new Kysymys(rs));
        }
        rs.close();
        return lista;
    }
}
