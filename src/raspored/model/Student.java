/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspored.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author FeritApostol
 */
@Entity
@Table
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private int id_student;
    
    private String index;
    private String ime;
    private String prezime;
    private BigDecimal broj_dolaznosti;
    
    @ManyToMany(mappedBy = "studenti")
    private Set<Predmet> predmeti = new HashSet<>(); 

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Set<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(Set<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public BigDecimal getBroj_dolaznosti() {
        return broj_dolaznosti;
    }

    public void setBroj_dolaznosti(BigDecimal broj_dolaznosti) {
        this.broj_dolaznosti = broj_dolaznosti;
    }

    @Override
    public String toString() {
       return getIme();
    }
 
}
