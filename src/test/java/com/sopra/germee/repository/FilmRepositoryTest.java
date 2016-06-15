// package com.sopra.germee.repository;
//
// import javax.inject.Inject;
// import javax.persistence.EntityManager;
// import javax.transaction.Transactional;
//
// import org.dbunit.database.IDatabaseConnection;
// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
// import com.sopra.germee.config.TestConfig;
// import com.sopra.germee.repository.dbTestFolder.OperationsDataSet;
// import com.sopra.germee.repository.model.Film;
//
// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = TestConfig.class)
// @Transactional
//
// public class FilmRepositoryTest {
//
// @Inject
// EntityManager em;
//
// @Inject
// IDatabaseConnection dbUnitConnection;
//
// @Inject
// FilmRepository filmRepository;
//
// Film film = new Film();
//
// @Before
// public void setUp() throws Exception {
//
// OperationsDataSet.chargerDataset(dbUnitConnection, "src/test/java/com/sopra/germee/repository/dbTestFolder/dbTest.xml");
// }
//
// @After
// public void after() throws Exception {
// OperationsDataSet.fermerConnexion(dbUnitConnection);
// }
//
// @Test
// public void insertFilmTest() {
//
// film.setTitle("viche");
// filmRepository.insertFilm(film);
// }
//
// @Test
// public void searchByTitleTest() {
//
// filmRepository.searchByTitle("Viche");
// }
//
// @Test
// public void removeFilmTest() {
//
// filmRepository.removeFilm(1);
// }
//
// @Test
// public void updateFilmTest() {
//
// film = em.find(Film.class, (long) 2);
// film.setTitle("viche");
// filmRepository.updateFilm(film);
// }
//
// }
