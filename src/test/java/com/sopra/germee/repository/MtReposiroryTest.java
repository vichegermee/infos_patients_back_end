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
// import com.sopra.germee.repository.model.Medecin_traitant;
//
// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = TestConfig.class)
// @Transactional
//
// public class MtReposiroryTest {
//
// @Inject
// EntityManager em;
//
// @Inject
// IDatabaseConnection dbUnitConnection;
//
// @Inject
// MtRepository mtRepository;
//
// Medecin_traitant medecinTraitant = new Medecin_traitant();
//
// @Before
// public void setUp() throws Exception {
//
// OperationsDataSet.chargerDataset(dbUnitConnection,
// "src/test/java/com/sopra/germee/repository/dbTestFolder/dbTest.xml");
// }
//
// @After
// public void after() throws Exception {
// OperationsDataSet.fermerConnexion(dbUnitConnection);
// }
//
// @Test
// public void insertmedecinTraitantTest() {
//
// medecinTraitant.setNom_mt("viche");
// mtRepository.insertMedecin(medecinTraitant);
// }
//
// @Test
// public void searchByTitleTest() {
//
// mtRepository.searchByIdMedecin(1);
// }
//
// @Test
// public void removemedecinTraitantTest() {
//
// mtRepository.removeMedecin(1);
// }
//
// @Test
// public void updatemedecinTraitantTest() {
//
// medecinTraitant = em.find(Medecin_traitant.class, 2);
// medecinTraitant.setNom_mt("Nom médecin 2");
// mtRepository.updateMedecin(medecinTraitant);
// }
//
// }
