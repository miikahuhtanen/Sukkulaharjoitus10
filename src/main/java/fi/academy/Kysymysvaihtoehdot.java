package fi.academy;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Kysymysvaihtoehdot {

    private int id;
    private int kysymysID;
    private String teksti;
    private boolean oikeavastaus;

    public Kysymysvaihtoehdot(int id, int kysymysID, String teksti, boolean oikeavastaus){
        this.id = id;
        this.kysymysID = kysymysID;
        this.teksti = teksti;
        this.oikeavastaus = oikeavastaus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKysymysID() {
        return kysymysID;
    }

    public void setKysymysID(int kysymysID) {
        this.kysymysID = kysymysID;
    }

    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public boolean isOikeavastaus() {
        return oikeavastaus;
    }

    public void setOikeavastaus(boolean oikeavastaus) {
        this.oikeavastaus = oikeavastaus;
    }

    public String toString(){
        return "Kysymysvaihtoehto{ " +
                "id: " + this.id +
                ", kysymysID: " + this.kysymysID +
                ", teksti: " + this.teksti +
                ", oikeavastaus: " + this.oikeavastaus +"}";

    }

    public Kysymysvaihtoehdot(ResultSet rs) throws SQLException {
        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            String label = rs.getMetaData().getColumnName(i);
            switch (label){
                case "id":
                    this.id = rs.getInt(i);
                    break;
                case "kysymysID":
                    this.kysymysID = rs.getInt(i);
                    break;
                case "teksti":
                    this.teksti = rs.getString(i);
                    break;
                case "oikeavastaus":
                    int temp = rs.getInt(i);
                    if (temp == 0){
                        this.oikeavastaus = false;
                    } else {
                        this.oikeavastaus = true;
                    }
            }
        }
//        this.id = rs.getInt("id");
//        this.kysymysID = rs.getInt("kysymysID");
//        this.teksti = rs.getString("teksti");
//        int temp = rs.getInt("oikeavastaus");
//        if (temp == 0){
//            this.oikeavastaus = false;
//        } else {
//            this.oikeavastaus = true;
//        }
    }

}
