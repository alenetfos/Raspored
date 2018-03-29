/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspored.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author Polaznik
 */
@Entity
@Table
public class Smjer implements Serializable {
    
    @Id
    @GeneratedValue
    private int idSmjer;
    
    @Column(name="naziv")
    @Type(type="text")
    private String naziv;
    
    @Column(name="opis")
    @Type(type="text")
    private String opis;

    public int getIdSmjer() {
        return idSmjer;
    }

    public void setIdSmjer(int idSmjer) {
        this.idSmjer = idSmjer;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    @Override
    public String toString() {
       return getNaziv();
    }

}
