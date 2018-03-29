/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspored.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
    private int idPredmet;
    
    @ManyToOne
    private Godina godina;
    private String naziv;
    private BigDecimal brojSati;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "predaje", 
        joinColumns = { @JoinColumn(name = "id_predmet") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_profesor") }
    )
    private List<Profesor> profesori=new ArrayList<>();
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "dolaznost", 
        joinColumns = { @JoinColumn(name = "id_predmet") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_student") }
    )
    private List<Student> studenti=new ArrayList<>();

    public int getIdPredmet() {
        return idPredmet;
    }

    public void setIdPredmet(int idPredmet) {
        this.idPredmet = idPredmet;
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

    public BigDecimal getBrojSati() {
        return brojSati;
    }

    public void setBrojSati(BigDecimal brojSati) {
        this.brojSati = brojSati;
    }

    public List<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(List<Profesor> profesori) {
        this.profesori = profesori;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
    
    @Override
    public String toString() {
       return getNaziv();
    }
}
