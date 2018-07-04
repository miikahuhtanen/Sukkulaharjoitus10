package fi.academy;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Kysymys {
    private int id;
    private String teksti;
    private int tyyppiID;
    private int kategoriaID;

    public Kysymys(int id, String teksti, int tyyppiID, int kategoriaID){
        this.id = id;
        this.teksti = teksti;
        this.tyyppiID = tyyppiID;
        this.kategoriaID = kategoriaID;
    }

    public Kysymys(ResultSet rs) throws SQLException {
        this.id = rs.getInt("id");
        this.teksti = rs.getString("teksti");
        this.tyyppiID = rs.getInt("tyyppiID");
        this.kategoriaID = rs.getInt("kategoriaID");
    }

    @Override
    public String toString() {
        return "Kysymys{" +
                "id=" + id +
                ", teksti='" + teksti + '\'' +
                ", tyyppiID=" + tyyppiID +
                ", kategoriaID=" + kategoriaID +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public int getTyyppiID() {
        return tyyppiID;
    }

    public void setTyyppiID(int tyyppiID) {
        this.tyyppiID = tyyppiID;
    }

    public int getKategoriaID() {
        return kategoriaID;
    }

    public void setKategoriaID(int kategoriaID) {
        this.kategoriaID = kategoriaID;
    }
}


