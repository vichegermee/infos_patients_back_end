package com.sopra.germee.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "caisses")
@Entity
public class Caisses {


    public Caisses() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCaisse;
    private String libCaisse;

    @ManyToOne
    @JoinColumn(name = "idReg")
    private Regimes regime;

    public Regimes getRegime() {
        return regime;
    }

    public void setRegime(Regimes regime) {
        this.regime = regime;
    }

    public int getId_caisse() {
        return idCaisse;
    }

    public void setId_caisse(int idCaisse) {
        this.idCaisse = idCaisse;
    }

    public String getLib_caisse() {
        return libCaisse;
    }

    public void setLib_caisse(String libCaisse) {
        this.libCaisse = libCaisse;
    }

}
