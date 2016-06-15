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
// import com.sopra.germee.repository.model.Regimes;
//
// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = TestConfig.class)
// @Transactional
//
// public class RegimesRepositoryTest {
//
// @Inject
// EntityManager em;
//
// @Inject
// IDatabaseConnection dbUnitConnection;
//
// @Inject
// RegimesRepository regimesRepository;
//
// Regimes regimes = new Regimes();
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
// public void insertregimesTest() {
//
// regimes.setLibreg("regime générale");
// regimesRepository.insertRegime(regimes);
// }
//
// @Test
// public void searchByTitleTest() {
//
// regimesRepository.searchByIdRegime(1);
// }
//
// @Test
// public void removeregimesTest() {
//
// regimesRepository.removeRegime(4);
// }
//
// @Test
// public void updateregimesTest() {
//
// regimes = em.find(Regimes.class, 1);
// regimes.setLibreg("MUTUALITE SOCIALE AGRICOLE");
// regimesRepository.updateRegime(regimes);
// }
//
// }
