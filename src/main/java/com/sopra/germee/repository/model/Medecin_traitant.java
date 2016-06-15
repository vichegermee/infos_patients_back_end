package com.sopra.germee.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mt")
@Entity
public class Medecin_traitant {

    /**
    *
    */

    public Medecin_traitant() {
        // TODO Auto-generated constructor stub
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMt;
    private String nomMt;
    private String prenomMt;
    private String numTel;
    private String adresseMt;

    public int getId_mt() {
        return idMt;
    }

    public void setId_mt(int idMt) {
        this.idMt = idMt;
    }

    public String getNom_mt() {
        return nomMt;
    }

    public void setNom_mt(String nomMt) {
        this.nomMt = nomMt;
    }

    public String getPrenom_mt() {
        return prenomMt;
    }

    public void setPrenom_mt(String prenomMt) {
        this.prenomMt = prenomMt;
    }

    public String getNum_tel_mt() {
        return numTel;
    }

    public void setNum_tel(String numTel) {
        this.numTel = numTel;
    }

    public String getAdresse_mt() {
        return adresseMt;
    }

    public void setAdresse_mt(String adresseMt) {
        this.adresseMt = adresseMt;
    }
}
