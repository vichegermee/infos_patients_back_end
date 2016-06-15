// package com.sopra.germee.repository;
//
// import java.text.ParseException;
// import java.text.SimpleDateFormat;
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
// import com.sopra.germee.repository.model.Patient;
// import com.sopra.germee.repository.model.Regimes;
//
// import junit.framework.TestCase;
//
// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = TestConfig.class)
// @Transactional
//
// public class PatientRepositoryTest extends TestCase {
//
// @Inject
// EntityManager em;
//
// @Inject
// IDatabaseConnection dbUnitConnection;
//
// @Inject
// PatientRepository patientRepository;
// Patient patient = new Patient();
//
// @Before
// public void setUp() throws Exception {
//
// OperationsDataSet.chargerDataset(dbUnitConnection, "src/test/java/com/sopra/germee/repository/dbTestFolder/dbTest.xml");
//
// }
//
// @After
// public void after() throws Exception {
// OperationsDataSet.fermerConnexion(dbUnitConnection);
// }
//
// @Test
// public void insertPatient() throws ParseException {
//
// patient.setIdentifiant("bggg111");;
// patient.setNom("nom1");
// patient.setPrenomPt("prenom1");
// patient.setNirOd("12545236");
//
// SimpleDateFormat formater = null;
// String aujourdhui = "2000-05-30";
// formater = new SimpleDateFormat("yyyy-mm-dd");
//
// patient.setDateNaiss(formater.parse(aujourdhui));
// patient.setRang(1);
// patient.setDdt(true);
// patient.setExoneration(false);
// patient.setAcs(true);
// patient.setCmuc(false);
// patient.setAme(true);
//
// patientRepository.insertPatient(patient);
// }
//
// @Test
// public void searchByIdPatientTest() {
// patientRepository.searchByIdPatient("123654198502011");
// }
//
// @Test
// public void searchByRegimeTest() {
// Regimes regime = new Regimes();
// regime.setIdreg(5);
// patientRepository.searchByRegime(regime);
// }
//
// @Test
// public void searchByNirOdTest() {
// patientRepository.searchByNirOd("220222199208192");
// }
//
// @Test
// public void removePatientTest() {
// patientRepository.removePatient("206396199809213");
// }
//
// @Test
// public void updatePatientTest() {
// patient = em.find(Patient.class, "220222199208192");
// patientRepository.updatePatient(patient);
// }
// }
