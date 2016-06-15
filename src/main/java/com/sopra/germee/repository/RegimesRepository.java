package com.sopra.germee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopra.germee.repository.model.Regimes;

@Repository
@Transactional
public class RegimesRepository {

    @PersistenceContext
    private EntityManager em;

    private Regimes regime = new Regimes();

    @Autowired
    public RegimesRepository(EntityManager em) {
        super();
        this.em = em;
    }

    // INSERTION
    public void insertRegime(Regimes regime) {
        em.persist(regime);
    }

    // SELECTION
    public Regimes searchByIdRegime(int idRegime) {
        // Regimes regime = null;

        String jpql = "SELECT r FROM Regimes r WHERE r.idReg = :id";
        Query query = em.createQuery(jpql);
        query.setParameter("id", idRegime);
        regime = (Regimes) query.getSingleResult();

        return regime;

    }

    // SELECT LIST REGIMES
    @SuppressWarnings("unchecked")
    public List<Regimes> listRegimes() {

        List<Regimes> liste = null;
        String jpql = "SELECT r FROM Regimes r";
        Query query = em.createQuery(jpql);
        liste = query.getResultList();
        return liste;
    }

    // REMOVE
    public void removeRegime(int id) {

        regime = em.find(Regimes.class, id);
        em.remove(regime);
        em.flush();
    }

    // UPDATE
    public void updateRegime(Regimes regime) {

        em.merge(regime);
        em.flush();
    }
}
