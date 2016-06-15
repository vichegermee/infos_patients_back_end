// package com.sopra.germee.repository;
//
// import javax.inject.Inject;
// import javax.persistence.EntityManager;
// import javax.sql.DataSource;
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
// import com.sopra.germee.repository.model.Caisses;
//
// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = TestConfig.class)
// @Transactional
//
// public class CaissesRepositoryTest {
//
// @Inject
// EntityManager em;
//
// @Inject
// DataSource datasource;
//
// @Inject
// IDatabaseConnection dbUnitConnection;
//
// @Inject
// CaissesRepository caissesRepository;
//
// Caisses caisses = new Caisses();
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
// public void insertCaisseTest() {
//
// caisses.setLib_caisse("caisse_num_1");
// caissesRepository.insertCaisse(caisses);
// }
//
// @Test
// public void searchByIdCaisseTest() {
//
// caissesRepository.searchByIdCaisse(1);
//
// }
//
// @Test
// public void removeCaisseTest() {
//
// caissesRepository.removeCaisse(5);
// }
//
// @Test
// public void updateCaisseTest() {
//
// caisses = em.find(Caisses.class, 1);
// caisses.setLib_caisse("caisse_num_25");
// caissesRepository.updateCaisse(caisses);
// }
//
// }
