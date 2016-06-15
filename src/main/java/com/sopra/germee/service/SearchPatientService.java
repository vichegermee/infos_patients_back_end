package com.sopra.germee.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sopra.germee.repository.PatientRepository;
import com.sopra.germee.repository.model.Patient;
import com.sopra.germee.repository.model.Regimes;


/**
 * Service de recherche des patients
 * 
 * @author vgermee
 *
 */
@Service
@Transactional
public class SearchPatientService {

    @Inject
    private PatientRepository patientRepository;

    public List<Patient> searchByNir(String nirOd) {
        return patientRepository.searchByNirOd(nirOd);
    }

    public List<Patient> searchByRegimeService(Regimes regimes) {

        return patientRepository.searchByRegime(regimes);
    }

    public Patient searchById(String idPt) {
        return patientRepository.searchByIdPatient(idPt);
    }

    public void insertIntoBase(Patient patient) {
        patientRepository.insertPatient(patient);
    }

}
