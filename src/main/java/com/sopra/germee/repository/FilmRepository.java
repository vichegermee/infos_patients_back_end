package com.sopra.germee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopra.germee.repository.model.Film;

@Repository
@Transactional
public class FilmRepository {

    @PersistenceContext
    private EntityManager em;

    private Film film = new Film();

    @Autowired
    public FilmRepository(EntityManager em) {
        super();
        this.em = em;
    }

    public void insertFilm(Film film) {

        em.persist(film);
    }

    @SuppressWarnings("unchecked")
    public List<Film> searchByTitle(String titleLike) {
        String jpql = "SELECT f FROM Film f WHERE f.title Like :titleLike";
        Query query = em.createQuery(jpql);

        Query parametrisedQuery = query.setParameter("titleLike", titleLike);

        List<Film> result = parametrisedQuery.getResultList();

        //

        return result;
    }

    public void removeFilm(long id) {

        film = em.find(Film.class, id);
        em.remove(film);
        em.flush();
    }

    public void updateFilm(Film filmAModifier) {

        em.merge(filmAModifier);
        em.flush();
    }
}
