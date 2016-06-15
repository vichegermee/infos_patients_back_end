package com.sopra.germee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopra.germee.repository.model.Medecin_traitant;

@Repository
@Transactional
public class MtRepository {

    @PersistenceContext
    private EntityManager em;

    private Medecin_traitant medecin = new Medecin_traitant();

    @Autowired
    public MtRepository(EntityManager em) {
        super();
        this.em = em;
    }

    // INSERTION
    public void insertMedecin(Medecin_traitant medecin) {
        em.persist(medecin);
    }

    // SELECTION
    public Medecin_traitant searchByIdMedecin(int idMedecin) {

        String jpql = "SELECT m FROM Medecin_traitant m WHERE m.idMt = :id";
        Query query = em.createQuery(jpql);
        query.setParameter("id", idMedecin);
        medecin = (Medecin_traitant) query.getSingleResult();

        return medecin;

    }

    // SELECT LIST MEDECINS TRAITANT
    @SuppressWarnings("unchecked")
    public List<Medecin_traitant> listMt() {

        List<Medecin_traitant> liste = null;
        String jpql = "SELECT m FROM Medecin_traitant m";
        Query query = em.createQuery(jpql);
        liste = query.getResultList();
        return liste;
    }

    // REMOVE
    public void removeMedecin(int idMedecin) {

        medecin = em.find(Medecin_traitant.class, idMedecin);
        em.remove(medecin);
        em.flush();
    }

    // UPDATE
    public void updateMedecin(Medecin_traitant medecin) {

        em.merge(medecin);
        em.flush();
    }
}
