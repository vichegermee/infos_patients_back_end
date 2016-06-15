package com.sopra.germee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopra.germee.repository.model.Caisses;

@Repository
@Transactional
public class CaissesRepository {

    @PersistenceContext
    private EntityManager em;

    private Caisses caisses = new Caisses();

    @Autowired
    public CaissesRepository(EntityManager em) {
        super();
        this.em = em;
    }

    // INSERTION
    public void insertCaisse(Caisses caisses) {
        em.persist(caisses);
    }

    // SELECTION
    public Caisses searchByIdCaisse(int idCaisse) {

        String jpql = "SELECT c FROM Caisses c WHERE c.idCaisse = :id";
        Query query = em.createQuery(jpql);
        query.setParameter("id", idCaisse);
        caisses = (Caisses) query.getSingleResult();

        return caisses;

    }

    // SELECT LIST CAISSES
    @SuppressWarnings("unchecked")
    public List<Caisses> listCaisses() {

        List<Caisses> liste = null;
        String jpql = "SELECT c FROM Caisses c";
        Query query = em.createQuery(jpql);
        liste = query.getResultList();
        return liste;
    }

    // REMOVE
    public void removeCaisse(int id) {

        caisses = em.find(Caisses.class, id);
        em.remove(caisses);
        em.flush();
    }

    // UPDATE
    public void updateCaisse(Caisses caisses) {

        em.merge(caisses);
        em.flush();
    }
}
