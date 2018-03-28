/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspored.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Polaznik
 */

@Entity
@Table
public class Godina implements Serializable {
    
    @Id
    @GeneratedValue
    private int id_godina;
    
    @ManyToOne
    private Smjer smjer;
    private String broj_godine;

    public int getId_godina() {
        return id_godina;
    }

    public void setId_godina(int id_godina) {
        this.id_godina = id_godina;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public String getBroj_godine() {
        return broj_godine;
    }

    public void setBroj_godine(String broj_godine) {
        this.broj_godine = broj_godine;
    }
    
    @Override
    public String toString() {
       return getBroj_godine();
    }

    
}
