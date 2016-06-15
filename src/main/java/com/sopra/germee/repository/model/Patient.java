package com.sopra.germee.repository.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "patient")
@Entity
public class Patient {

    /**
    *
    */

    public Patient() {
        // TODO Auto-generated constructor stub
    }

    @Id
    private String idPt;
    private String nomPt;
    private String prenomPt;
    private String nirOd;
    private Date dateNaiss;
    private int rang;
    private boolean ddj;
    private boolean exoneration;
    private boolean acs;
    private boolean cmuc;
    private boolean ame;

    @ManyToOne
    @JoinColumn(name = "idCaisse")
    private Caisses caisse;

    @ManyToOne
    @JoinColumn(name = "idMt")
    private Medecin_traitant mt;

    @ManyToOne
    @JoinColumn(name = "idReg")
    private Regimes regime;

    public Caisses getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisses caisse) {
        this.caisse = caisse;
    }

    public Medecin_traitant getMt() {
        return mt;
    }

    public void setMt(Medecin_traitant mt) {
        this.mt = mt;
    }

    public Regimes getRegime() {
        return regime;
    }

    public void setRegime(Regimes regime) {
        this.regime = regime;
    }

    public String getIdentifiant() {
        return idPt;
    }

    public void setIdentifiant(String idPt) {
        this.idPt = idPt;
    }

    public String getNom() {
        return nomPt;
    }

    public void setNom(String nomPt) {
        this.nomPt = nomPt;
    }

    public String getPrenomPt() {
        return prenomPt;
    }

    public void setPrenomPt(String prenomPt) {
        this.prenomPt = prenomPt;
    }

    public String getNirOd() {
        return nirOd;
    }

    public void setNirOd(String nirOd) {
        this.nirOd = nirOd;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date date) {
        this.dateNaiss = date;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public boolean isDdt() {
        return ddj;
    }

    public void setDdt(boolean string) {
        this.ddj = string;
    }

    public boolean isExoneration() {
        return exoneration;
    }

    public void setExoneration(boolean exoneration) {
        this.exoneration = exoneration;
    }

    public boolean isAcs() {
        return acs;
    }

    public void setAcs(boolean acs) {
        this.acs = acs;
    }

    public boolean isCmuc() {
        return cmuc;
    }

    public void setCmuc(boolean cmuc) {
        this.cmuc = cmuc;
    }

    public boolean isAme() {
        return ame;
    }

    public void setAme(boolean ame) {
        this.ame = ame;
    }

}
