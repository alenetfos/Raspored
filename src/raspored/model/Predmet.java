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
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author FeritApostol
 */
@Entity
@Table
public class Predmet implements Serializable {
    @Id
    @GeneratedValue
    private int id_predmet;
    
    @ManyToOne
    private Godina godina;
    private String naziv;
    private BigDecimal broj_sati;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "predaje", 
        joinColumns = { @JoinColumn(name = "id_predmet") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_profesor") }
    )
    Set<Profesor> profesori = new HashSet<>();

    public Set<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(Set<Profesor> profesori) {
        this.profesori = profesori;
    }
    
    
    

    public int getId_predmet() {
        return id_predmet;
    }

    public void setId_predmet(int id_predmet) {
        this.id_predmet = id_predmet;
    }

    public Godina getGodina() {
        return godina;
    }

    public void setGodina(Godina godina) {
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getBroj_sati() {
        return broj_sati;
    }

    public void setBroj_sati(BigDecimal broj_sati) {
        this.broj_sati = broj_sati;
    }
    
    @Override
    public String toString() {
       return getNaziv();
    }
}
