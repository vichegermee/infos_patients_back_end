package com.sopra.germee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopra.germee.repository.model.Patient;
import com.sopra.germee.repository.model.Regimes;

@Repository
@Transactional
public class PatientRepository {

    @PersistenceContext
    private EntityManager em;

    private Patient patient = new Patient();

    List<Patient> liste = null;

    @Autowired
    public PatientRepository(EntityManager em) {
        super();
        this.em = em;
    }

    // INSERTION
    public void insertPatient(Patient patient) {
        em.persist(patient);
    }

    // SELECTION
    public Patient searchByIdPatient(String idPatient) {

        String jpql = "SELECT p FROM Patient p WHERE p.idPt = :id";
        Query query = em.createQuery(jpql);
        query.setParameter("id", idPatient);
        patient = (Patient) query.getSingleResult();

        return patient;

    }

    // SELECT LES PATIENTS DU MÊME REGIME
    @SuppressWarnings("unchecked")
    public List<Patient> searchByRegime(Regimes regime) {

        String jpql = "SELECT p FROM Patient p WHERE p.regime = :regime";
        Query query = em.createQuery(jpql);
        query.setParameter("regime", regime);
        liste = query.getResultList();

        return liste;
    }

    // SELECT LIST
    @SuppressWarnings("unchecked")
    public List<Patient> searchByNirOd(String nirOd) {

        String jpql = "SELECT p FROM Patient p WHERE p.nirOd = :nirod";
        Query query = em.createQuery(jpql);
        query.setParameter("nirod", nirOd);
        liste = query.getResultList();

        return liste;
    }

    // REMOVE
    public void removePatient(String idPatient) {

        patient = em.find(Patient.class, idPatient);
        em.remove(patient);
        em.flush();
    }

    // UPDATE
    public void updatePatient(Patient Patient) {

        em.merge(patient);
        em.flush();
    }
}
