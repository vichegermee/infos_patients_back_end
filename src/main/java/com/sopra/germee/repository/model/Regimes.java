package com.sopra.germee.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "regimes")
@Entity
public class Regimes {

    /**
    *
    */

    public Regimes() {
        // TODO Auto-generated constructor stub
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReg;

    private String libReg;

    public int getIdreg() {
        return idReg;
    }

    public void setIdreg(int idReg) {
        this.idReg = idReg;
    }

    public String getLibreg() {
        return libReg;
    }

    public void setLibreg(String libReg) {
        this.libReg = libReg;
    }
}
